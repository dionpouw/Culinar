package com.jeflette.culinar.data

import com.jeflette.culinar.data.local.LocalDataSource
import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.data.remote.RemoteDataSource
import com.jeflette.culinar.data.remote.response.Mood
import javax.inject.Inject

class RestaurantRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource, private val localDataSource: LocalDataSource
) {

    suspend fun getRestaurantListFromRemote(data: Mood) = remoteDataSource.getRestaurantList(data)

    suspend fun getRestaurantListFromLocal() = localDataSource.getRestaurantList()

    suspend fun saveRestaurantsToDb(restaurantList: List<Restaurant>) =
        localDataSource.saveRestaurantsToDb(restaurantList)
}
