package com.jeflette.culinar.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jeflette.culinar.navigation.Screen
import com.jeflette.culinar.ui.screen.detailscreen.DetailScreenApp
import com.jeflette.culinar.ui.screen.homescreen.HomeScreenApp

@Composable
fun CulinarApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route) {
            HomeScreenApp(showRestaurantDetailPage = { restaurantAddress ->
                navController.navigate(Screen.DetailScreen.createRoute(restaurantAddress))
            })
        }
        composable(route = Screen.DetailScreen.route) { backStackEntry ->
            val restaurantAddress = backStackEntry.arguments?.getString("restaurantAddress")
            requireNotNull(restaurantAddress) {
                "No restaurantAddress passed to DetailScreenApp"
            }
            DetailScreenApp(restaurantAddress, navigateUp = {
                navController.popBackStack(
                    Screen.DetailScreen.route, inclusive = true
                )
            })
        }
    }
}