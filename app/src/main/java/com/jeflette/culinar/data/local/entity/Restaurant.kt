package com.jeflette.culinar.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "restaurants")
data class Restaurant(

    @PrimaryKey(autoGenerate = true) val id: Int? = null,

    @field:SerializedName("address") val address: String? = null,

    @field:SerializedName("image_url") val imageUrl: String? = null,

    @field:SerializedName("latitude") val latitude: String? = null,

    @field:SerializedName("average_price") val averagePrice: String? = null,

    @field:SerializedName("name") val name: String? = null,

    @field:SerializedName("rating") val rating: String? = null,

    @field:SerializedName("cuisine") val cuisine: String? = null,

    @field:SerializedName("longitude") val longitude: String? = null
)
