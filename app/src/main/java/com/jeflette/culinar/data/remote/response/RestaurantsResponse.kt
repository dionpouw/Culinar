package com.jeflette.culinar.data.remote.response

import com.google.gson.annotations.SerializedName
import com.jeflette.culinar.data.local.entity.Restaurant

data class RestaurantsResponse(

    @field:SerializedName("status_code") val statusCode: Int? = null,

    @field:SerializedName("data") val data: Data? = null,

    @field:SerializedName("message") val message: String? = null
)

data class Restaurants(

    @field:SerializedName("restaurant_6") val restaurant6: Restaurant? = null,

    @field:SerializedName("restaurant_7") val restaurant7: Restaurant? = null,

    @field:SerializedName("restaurant_8") val restaurant8: Restaurant? = null,

    @field:SerializedName("restaurant_9") val restaurant9: Restaurant? = null,

    @field:SerializedName("restaurant_2") val restaurant2: Restaurant? = null,

    @field:SerializedName("restaurant_3") val restaurant3: Restaurant? = null,

    @field:SerializedName("restaurant_4") val restaurant4: Restaurant? = null,

    @field:SerializedName("restaurant_5") val restaurant5: Restaurant? = null,

    @field:SerializedName("restaurant_1") val restaurant1: Restaurant? = null
)

data class Data(

    @field:SerializedName("restaurants") val restaurants: Restaurants? = null,

    @field:SerializedName("top_three_restaurants") val topThreeRestaurants: List<String?>? = null
)
