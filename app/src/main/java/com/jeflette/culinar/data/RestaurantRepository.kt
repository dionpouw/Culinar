package com.jeflette.culinar.data

import com.jeflette.culinar.data.remote.response.Mood
import com.jeflette.culinar.network.ApiService
import javax.inject.Inject

class RestaurantRepository @Inject constructor(
    private val api: ApiService
) {
//
//    suspend fun getRestaurantList() = api.getRestaurantList()

    suspend fun getRestaurantListFromRemote(data: Mood) = api.getRestaurantList(data)

}
