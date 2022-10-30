package com.jeflette.culinar.data.remote

import com.jeflette.culinar.data.remote.response.Mood
import com.jeflette.culinar.network.ApiService
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getRestaurantList(data: Mood) = apiService.getRestaurantList(data)
}