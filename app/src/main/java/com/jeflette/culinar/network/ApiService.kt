package com.jeflette.culinar.network

import retrofit2.http.POST

interface ApiService {

    @POST("find")
    suspend fun getRestaurant(mood:String):
}