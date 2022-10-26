package com.jeflette.culinar.data.remote.response

import com.google.gson.annotations.SerializedName

data class RestaurantsResponse(

    @field:SerializedName("status_code") val statusCode: Int? = null,

    @field:SerializedName("data") val data: Data? = null,

    @field:SerializedName("message") val message: String? = null
)

data class Restaurants(

    @field:SerializedName("restaurant_6") val restaurant6: Restaurant6? = null,

    @field:SerializedName("restaurant_7") val restaurant7: Restaurant7? = null,

    @field:SerializedName("restaurant_8") val restaurant8: Restaurant8? = null,

    @field:SerializedName("restaurant_9") val restaurant9: Restaurant9? = null,

    @field:SerializedName("restaurant_2") val restaurant2: Restaurant2? = null,

    @field:SerializedName("restaurant_3") val restaurant3: Restaurant3? = null,

    @field:SerializedName("restaurant_4") val restaurant4: Restaurant4? = null,

    @field:SerializedName("restaurant_5") val restaurant5: Restaurant5? = null,

    @field:SerializedName("restaurant_1") val restaurant1: Restaurant1? = null
)

data class Restaurant5(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Data(

    @field:SerializedName("restaurants") val restaurants: Restaurants? = null,

    @field:SerializedName("top_three_restaurants") val topThreeRestaurants: List<String?>? = null
)

data class Restaurant8(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant9(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant7(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant1(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant3(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant4(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant6(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)

data class Restaurant2(

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)
