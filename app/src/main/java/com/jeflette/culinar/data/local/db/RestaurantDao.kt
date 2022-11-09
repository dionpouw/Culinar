package com.jeflette.culinar.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jeflette.culinar.data.local.entity.Restaurant
import kotlinx.coroutines.flow.Flow

@Dao
interface RestaurantDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveRestaurantsToDb(restaurant: List<Restaurant>)

    @Query("SELECT * FROM restaurants where mood = :mood")
    fun getRestaurantList(mood: String): Flow<List<Restaurant>>

    @Query("SELECT * FROM restaurants where address = :address")
    fun getRestaurantByAddress(address: String): Flow<Restaurant>
}