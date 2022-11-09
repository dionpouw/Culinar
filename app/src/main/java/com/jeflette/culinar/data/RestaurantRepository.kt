package com.jeflette.culinar.data

import com.jeflette.culinar.data.local.LocalDataSource
import com.jeflette.culinar.data.remote.RemoteDataSource
import com.jeflette.culinar.data.remote.response.Mood
import com.jeflette.culinar.data.remote.response.Restaurants
import com.jeflette.culinar.util.mapFromRestaurantsToList
import com.jeflette.culinar.util.networkBoundResource
import javax.inject.Inject

class RestaurantRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource, private val localDataSource: LocalDataSource
) {

    fun getRestaurant(mood: String) = networkBoundResource(
        query = { localDataSource.getRestaurantList(mood) },
        fetch = { remoteDataSource.getRestaurantList(Mood(mood)) },
        saveFetchResult = {
            localDataSource.saveRestaurantsToDb(
                mapFromRestaurantsToList(
                    it.data?.restaurants ?: Restaurants(), mood
                )
            )
        },
    )

    fun getRestaurantByAddress(address: String) = localDataSource.getRestaurantByAddress(address)
}
