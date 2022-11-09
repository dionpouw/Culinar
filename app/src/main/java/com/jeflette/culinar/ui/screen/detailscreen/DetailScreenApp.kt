package com.jeflette.culinar.ui.screen.detailscreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.jeflette.culinar.ui.screen.commonui.HomeAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreenApp(restaurantAddress: String, navigateUp: () -> Unit) {
    // val viewModel: DetailViewModel = viewModel()
    val viewModel = hiltViewModel<DetailViewModel>()
    // TODO Scaffold should use NavigateUp to go back to the previous screen
    Scaffold(topBar = { HomeAppBar() },
        content = { DetailScreenContent(Modifier.padding(it), restaurantAddress, viewModel) })
}