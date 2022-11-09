package com.jeflette.culinar.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object DetailScreen : Screen("{restaurantAddress}/detail_screen") {
        fun createRoute(restaurantAddress: String) = "$restaurantAddress/detail_screen"
    }
}
