package com.jeflette.culinar.ui.screen.homescreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.jeflette.culinar.ui.screen.commonui.HomeAppBar
import com.jeflette.culinar.ui.theme.CulinarTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreenApp(
    showRestaurantDetailPage: (restaurantAddress: String) -> Unit
) {
    val viewModel = hiltViewModel<HomeScreenViewModel>()
//    val viewModel: HomeScreenViewModel = viewModel()
    Scaffold(topBar = { HomeAppBar() }, content = {
        HomeScreenContent(
            showDetailRestaurantPage = showRestaurantDetailPage,
            modifier = Modifier.padding(it),
            viewModel
        )
    })
}


@Preview(showBackground = true, device = Devices.PIXEL_4_XL, showSystemUi = true)
@Composable
fun DefaultPreview() {
    CulinarTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
        ) {}
    }
}