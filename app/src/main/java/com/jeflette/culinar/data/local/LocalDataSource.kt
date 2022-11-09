package com.jeflette.culinar.data.local

import com.jeflette.culinar.data.local.db.RestaurantDao
import com.jeflette.culinar.data.local.entity.Restaurant
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val restaurantDao: RestaurantDao
) {
    fun getRestaurantList(mood: String) = restaurantDao.getRestaurantList(mood)

    suspend fun saveRestaurantsToDb(restaurantList: List<Restaurant>) =
        restaurantDao.saveRestaurantsToDb(restaurantList)

    fun getRestaurantByAddress(address: String) = restaurantDao.getRestaurantByAddress(address)
}
