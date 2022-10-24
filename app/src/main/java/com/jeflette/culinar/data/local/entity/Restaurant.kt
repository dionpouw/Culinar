package com.jeflette.culinar.data.local.entity

import com.google.gson.annotations.SerializedName

data class Restaurant(

  //  @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: Int,

  //  @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String,

    @field:SerializedName("name") val name: String,

  //  @field:SerializedName("rating") val rating: String,

    //@field:SerializedName("cuisine") val cuisine: String? = null,

    //@field:SerializedName("longitude") val longitude: String? = null
)
