package com.jeflette.culinar.util

import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.data.remote.response.Restaurants

fun mapFromRestaurantsToList(restaurants: Restaurants): List<Restaurant> {
    return listOf(
        Restaurant(
            name = restaurants.restaurant1?.name,
            address = restaurants.restaurant1?.address,
            rating = restaurants.restaurant1?.rating,
            imageUrl = restaurants.restaurant1?.imageUrl,
            averagePrice = restaurants.restaurant1?.averagePrice,
            latitude = restaurants.restaurant1?.latitude,
            longitude = restaurants.restaurant1?.longitude,
            cuisine = restaurants.restaurant1?.cuisine
        ), Restaurant(
            name = restaurants.restaurant2?.name,
            address = restaurants.restaurant2?.address,
            rating = restaurants.restaurant2?.rating,
            imageUrl = restaurants.restaurant2?.imageUrl,
            averagePrice = restaurants.restaurant2?.averagePrice,
            latitude = restaurants.restaurant2?.latitude,
            longitude = restaurants.restaurant2?.longitude,
            cuisine = restaurants.restaurant2?.cuisine
        ), Restaurant(
            name = restaurants.restaurant3?.name,
            address = restaurants.restaurant3?.address,
            rating = restaurants.restaurant3?.rating,
            imageUrl = restaurants.restaurant3?.imageUrl,
            averagePrice = restaurants.restaurant3?.averagePrice,
            latitude = restaurants.restaurant3?.latitude,
            longitude = restaurants.restaurant3?.longitude,
            cuisine = restaurants.restaurant3?.cuisine
        ), Restaurant(
            name = restaurants.restaurant4?.name,
            address = restaurants.restaurant4?.address,
            rating = restaurants.restaurant4?.rating,
            imageUrl = restaurants.restaurant4?.imageUrl,
            averagePrice = restaurants.restaurant4?.averagePrice,
            latitude = restaurants.restaurant4?.latitude,
            longitude = restaurants.restaurant4?.longitude,
            cuisine = restaurants.restaurant4?.cuisine
        ), Restaurant(
            name = restaurants.restaurant5?.name,
            address = restaurants.restaurant5?.address,
            rating = restaurants.restaurant5?.rating,
            imageUrl = restaurants.restaurant5?.imageUrl,
            averagePrice = restaurants.restaurant5?.averagePrice,
            latitude = restaurants.restaurant5?.latitude,
            longitude = restaurants.restaurant5?.longitude,
            cuisine = restaurants.restaurant5?.cuisine
        ), Restaurant(
            name = restaurants.restaurant6?.name,
            address = restaurants.restaurant6?.address,
            rating = restaurants.restaurant6?.rating,
            imageUrl = restaurants.restaurant6?.imageUrl,
            averagePrice = restaurants.restaurant6?.averagePrice,
            latitude = restaurants.restaurant6?.latitude,
            longitude = restaurants.restaurant6?.longitude,
            cuisine = restaurants.restaurant6?.cuisine
        ), Restaurant(
            name = restaurants.restaurant7?.name,
            address = restaurants.restaurant7?.address,
            rating = restaurants.restaurant7?.rating,
            imageUrl = restaurants.restaurant7?.imageUrl,
            averagePrice = restaurants.restaurant7?.averagePrice,
            latitude = restaurants.restaurant7?.latitude,
            longitude = restaurants.restaurant7?.longitude,
            cuisine = restaurants.restaurant7?.cuisine
        ), Restaurant(
            name = restaurants.restaurant8?.name,
            address = restaurants.restaurant8?.address,
            rating = restaurants.restaurant8?.rating,
            imageUrl = restaurants.restaurant8?.imageUrl,
            averagePrice = restaurants.restaurant8?.averagePrice,
            latitude = restaurants.restaurant8?.latitude,
            longitude = restaurants.restaurant8?.longitude,
            cuisine = restaurants.restaurant8?.cuisine
        ), Restaurant(
            name = restaurants.restaurant9?.name,
            address = restaurants.restaurant9?.address,
            rating = restaurants.restaurant9?.rating,
            imageUrl = restaurants.restaurant9?.imageUrl,
            averagePrice = restaurants.restaurant9?.averagePrice,
            latitude = restaurants.restaurant9?.latitude,
            longitude = restaurants.restaurant9?.longitude,
            cuisine = restaurants.restaurant9?.cuisine
        )
    )
}