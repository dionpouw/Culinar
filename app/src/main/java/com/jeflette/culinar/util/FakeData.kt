package com.jeflette.culinar.util

import com.jeflette.culinar.R
import com.jeflette.culinar.data.local.entity.Restaurant

fun fakeData(): List<Restaurant> {
    return listOf(
        Restaurant(
            R.drawable.lawlessburger,
            "4.5",
            "Lawfull Burger",
        ),

        Restaurant(
            R.drawable.lawlessburger,
            "5",
            "Pizza House",
        ),

        Restaurant(
            R.drawable.lawlessburger,
            "3.75",
            "Hot Dog Palace",
        ),
        Restaurant(
            R.drawable.lawlessburger,
            "5",
            "Bucks Cafe",
        ), Restaurant(
            R.drawable.lawlessburger,
            "5",
            "Star Cafe",
        ), Restaurant(
            R.drawable.lawlessburger,
            "4",
            "Flips Chip",
        ), Restaurant(
            R.drawable.lawlessburger,
            "3.8",
            "Irish Bar",
        ), Restaurant(
            R.drawable.lawlessburger,
            "4",
            "Bake & Style",
        )
    )
}

fun fakeMood(): List<String> {
    return listOf(
        "Happy",
        "Sad",
        "Bored",
        "Lazy",
        "Hungry",
        "Loved",
        "Stress",
        "Depressed",
        "Angry"
    )
}