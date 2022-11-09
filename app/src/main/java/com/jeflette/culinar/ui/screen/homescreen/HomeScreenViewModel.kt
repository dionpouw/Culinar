package com.jeflette.culinar.ui.screen.homescreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jeflette.culinar.data.RestaurantRepository
import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.util.MoodState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _moodState: MutableStateFlow<String> =
        MutableStateFlow(MoodState.Happy.name.lowercase())
    val moodState: StateFlow<String> = _moodState

    private val _restaurantList = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurantList: StateFlow<List<Restaurant>> = _restaurantList

    init {
        getRestaurantList()
    }

    fun getRestaurantList() {
        viewModelScope.launch {
            repository.getRestaurant(moodState.value.lowercase()).collect {
                _restaurantList.value = it.data ?: emptyList()
            }
        }
    }

    fun onSelectedCategoryChanged(category: String) {
        _moodState.value = category
    }
}