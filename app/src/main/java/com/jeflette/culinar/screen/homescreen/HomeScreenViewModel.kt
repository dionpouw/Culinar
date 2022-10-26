package com.jeflette.culinar.screen.homescreen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeflette.culinar.data.RestaurantRepository
import com.jeflette.culinar.data.remote.response.Mood
import com.jeflette.culinar.data.remote.response.Restaurants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _restaurantList: MutableState<Restaurants> = mutableStateOf(Restaurants())
    val restaurantList: MutableState<Restaurants> = _restaurantList

    init {
        getRestaurantFromRemote()
    }

    private fun getRestaurantFromRemote() {
        viewModelScope.launch {
            _restaurantList.value =
                repository.getRestaurantListFromRemote(Mood("happy")).data?.restaurants
                    ?: Restaurants()
        }
    }
}