package com.jeflette.culinar.data.local.entity

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.parcelize.Parcelize

@Parcelize
data class Restaurant(

	@Json(name="address")
	val address: String? = null,

	@Json(name="image_url")
	val imageUrl: String? = null,

	@Json(name="latitude")
	val latitude: String? = null,

	@Json(name="average_price")
	val averagePrice: String? = null,

	@Json(name="name")
	val name: String? = null,

	@Json(name="rating")
	val rating: String? = null,

	@Json(name="cuisine")
	val cuisine: String? = null,

	@Json(name="longitude")
	val longitude: String? = null
) : Parcelable
