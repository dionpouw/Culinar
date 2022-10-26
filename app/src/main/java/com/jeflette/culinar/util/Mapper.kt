package com.jeflette.culinar.util

import com.jeflette.culinar.data.remote.response.Restaurant
import com.jeflette.culinar.data.remote.response.Restaurants

fun mapFromRestaurantsToList(restaurants: Restaurants): List<Restaurant> {
    return listOf(
        Restaurant(
            name = restaurants.restaurant1?.name,
            rating = restaurants.restaurant1?.rating,
            imageUrl = restaurants.restaurant1?.imageUrl,
            averagePrice = restaurants.restaurant1?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant2?.name,
            rating = restaurants.restaurant2?.rating,
            imageUrl = restaurants.restaurant2?.imageUrl,
            averagePrice = restaurants.restaurant2?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant3?.name,
            rating = restaurants.restaurant3?.rating,
            imageUrl = restaurants.restaurant3?.imageUrl,
            averagePrice = restaurants.restaurant3?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant4?.name,
            rating = restaurants.restaurant4?.rating,
            imageUrl = restaurants.restaurant4?.imageUrl,
            averagePrice = restaurants.restaurant4?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant5?.name,
            rating = restaurants.restaurant5?.rating,
            imageUrl = restaurants.restaurant5?.imageUrl,
            averagePrice = restaurants.restaurant5?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant6?.name,
            rating = restaurants.restaurant6?.rating,
            imageUrl = restaurants.restaurant6?.imageUrl,
            averagePrice = restaurants.restaurant6?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant7?.name,
            rating = restaurants.restaurant7?.rating,
            imageUrl = restaurants.restaurant7?.imageUrl,
            averagePrice = restaurants.restaurant7?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant8?.name,
            rating = restaurants.restaurant8?.rating,
            imageUrl = restaurants.restaurant8?.imageUrl,
            averagePrice = restaurants.restaurant8?.averagePrice,
        ), Restaurant(
            name = restaurants.restaurant9?.name,
            rating = restaurants.restaurant9?.rating,
            imageUrl = restaurants.restaurant9?.imageUrl,
            averagePrice = restaurants.restaurant9?.averagePrice,
        )
    )
}