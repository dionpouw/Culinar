package com.jeflette.culinar.network

import com.jeflette.culinar.data.remote.response.Mood
import com.jeflette.culinar.data.remote.response.RestaurantsResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("find")
    suspend fun getRestaurantList(@Body mood: Mood): RestaurantsResponse

}