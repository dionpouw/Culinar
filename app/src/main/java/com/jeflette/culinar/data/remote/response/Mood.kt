package com.jeflette.culinar.data.remote.response

import com.google.gson.annotations.SerializedName

data class Mood(
    @SerializedName("mood") val mood: String,
)
