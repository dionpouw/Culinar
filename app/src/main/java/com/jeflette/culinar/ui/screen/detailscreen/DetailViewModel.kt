package com.jeflette.culinar.ui.screen.detailscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeflette.culinar.data.RestaurantRepository
import com.jeflette.culinar.data.local.entity.Restaurant
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val restaurantRepository: RestaurantRepository
) : ViewModel() {

    private val _restaurant = MutableStateFlow<Restaurant?>(null)
    val restaurant = _restaurant

    fun getRestaurantByAddress(address: String) {
        viewModelScope.launch {
            restaurantRepository.getRestaurantByAddress(address).collect {
                _restaurant.value = it
            }
        }
    }
}
