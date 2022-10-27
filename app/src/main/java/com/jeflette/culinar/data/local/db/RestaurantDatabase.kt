package com.jeflette.culinar.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.jeflette.culinar.data.local.entity.Restaurant

@Database(entities = [Restaurant::class], version = 1, exportSchema = false)
abstract class RestaurantDatabase : RoomDatabase() {
    abstract fun restaurantDao(): RestaurantDao
}