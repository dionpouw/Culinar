package com.jeflette.culinar.data.local.entity

import com.google.gson.annotations.SerializedName

data class Response(

    @field:SerializedName("status_code") val statusCode: Int? = null,

    @field:SerializedName("data") val data: List<Restaurant>? = null,

    @field:SerializedName("message") val message: String? = null
)
