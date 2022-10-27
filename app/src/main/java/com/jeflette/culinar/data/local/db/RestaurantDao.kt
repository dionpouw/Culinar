package com.jeflette.culinar.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jeflette.culinar.data.local.entity.Restaurant

@Dao
interface RestaurantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveRestaurantsToDb(restaurant: List<Restaurant>)

    @Query("SELECT * FROM restaurants")
    suspend fun getRestaurantList(): List<Restaurant>


// TODO : Add function to get all restaurant from database as MutableStateFlow
}