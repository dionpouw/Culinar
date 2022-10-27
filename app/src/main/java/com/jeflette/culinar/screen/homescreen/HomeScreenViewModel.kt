package com.jeflette.culinar.screen.homescreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeflette.culinar.data.RestaurantRepository
import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.data.remote.response.Mood
import com.jeflette.culinar.data.remote.response.Restaurants
import com.jeflette.culinar.util.mapFromRestaurantsToList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: RestaurantRepository
) : ViewModel() {

    // TODO Fix this nullability
    private val _restaurantList = MutableStateFlow(Restaurants())
    val restaurantList: StateFlow<Restaurants> = _restaurantList

    lateinit var restaurant: List<Restaurant>

    init {
        getRestaurantFromRemote()
    }

    private fun getRestaurantFromRemote() {
        viewModelScope.launch {
            _restaurantList.value =
                repository.getRestaurantListFromRemote(Mood("happy")).data?.restaurants
                    ?: Restaurants()
            restaurant = mapFromRestaurantsToList(restaurantList.value)
            saveRestaurantsToDatabase(restaurants = restaurant)
        }
    }

    fun saveRestaurantsToDatabase(restaurants: List<Restaurant>) {
        viewModelScope.launch {
            repository.saveRestaurantsToDb(restaurants)
        }
    }
}