package com.jeflette.culinar.data.remote

import android.os.Parcelable
import com.jeflette.culinar.data.local.entity.Restaurant
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class RestaurantsResponse(

    @Json(name = "data") val data: Data? = null,

    @Json(name = "message") val message: String? = null,

    @Json(name = "status_code") val statusCode: Int? = null
) : Parcelable

@Parcelize
data class Data(

    @Json(name = "restaurants") val restaurants: List<Restaurant>? = null,

    @Json(name = "top_three_restaurants") val topThreeRestaurants: List<String>? = null
) : Parcelable
