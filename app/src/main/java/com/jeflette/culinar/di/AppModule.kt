package com.jeflette.culinar.di

import android.app.Application
import androidx.room.Room
import com.jeflette.culinar.BuildConfig
import com.jeflette.culinar.data.local.db.RestaurantDatabase
import com.jeflette.culinar.network.ApiService
import com.jeflette.culinar.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    } else {
        OkHttpClient.Builder().build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder().baseUrl(Constant.baseUrl)
            .addConverterFactory(GsonConverterFactory.create()).client(okHttpClient).build()

    @Singleton
    @Provides
    fun provideDogsApi(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Singleton
    @Provides
    fun provideAppDatabase(app: Application): RestaurantDatabase =
        Room.databaseBuilder(app, RestaurantDatabase::class.java, "restaurants.db").build()

}