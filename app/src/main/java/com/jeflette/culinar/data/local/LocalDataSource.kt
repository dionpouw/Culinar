package com.jeflette.culinar.data.local

import com.jeflette.culinar.data.local.db.RestaurantDao
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val restaurantDao: RestaurantDao
) {
    suspend fun getRestaurantList() = restaurantDao.getRestaurantList()
}
