package com.jeflette.culinar.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "restaurant")
data class Restaurant(

    //  @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: Int? = null,

    //  @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @PrimaryKey @field:SerializedName("name") val name: String,

    //  @field:SerializedName("rating") val rating: String? = null,

    //@field:SerializedName("cuisine") val cuisine: String? = null,

    //@field:SerializedName("longitude") val longitude: String? = null
)
