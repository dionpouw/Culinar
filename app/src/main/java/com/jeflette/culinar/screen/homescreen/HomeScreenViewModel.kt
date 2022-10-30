package com.jeflette.culinar.screen.homescreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeflette.culinar.data.RestaurantRepository
import com.jeflette.culinar.data.local.entity.Restaurant
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _restaurantList = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurantList: StateFlow<List<Restaurant>> = _restaurantList

    fun getRestaurantList(mood: String) {
        viewModelScope.launch {
            repository.getRestaurant(mood).collect {
                _restaurantList.value = it.data ?: emptyList()
            }
        }
    }
}