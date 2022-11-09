package com.jeflette.culinar.ui.screen.detailscreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.ui.theme.interFamily
import com.jeflette.culinar.util.toCurrencyFormat

@Composable
fun DetailScreenContent(
    modifier: Modifier = Modifier, restaurantAddress: String, viewModel: DetailViewModel
) {
    viewModel.getRestaurantByAddress(restaurantAddress)
    val restaurant by viewModel.restaurant.collectAsState()
    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize(),
    ) {
        AsyncImage(
            model = restaurant?.imageUrl,
            contentDescription = "detail image",
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text = restaurant?.name.toString(),
            style = MaterialTheme.typography.displaySmall,
            fontFamily = interFamily,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = restaurant?.cuisine + " - " + restaurant?.averagePrice?.toCurrencyFormat(),
            style = MaterialTheme.typography.titleMedium,
            fontFamily = interFamily,
        )
        Text(
            text = restaurant?.address.toString(), style = MaterialTheme.typography.bodyLarge,
            fontFamily = interFamily,
        )
        Spacer(Modifier.height(4.dp))
        RestaurantMap(restaurant = restaurant)
    }
}

@Preview(showSystemUi = true, showBackground = true, device = Devices.PIXEL_4_XL)
@Composable
fun DetailScreenPreview() {
    // DetailScreenContent()
}

@Composable
fun RestaurantMap(restaurant: Restaurant?, modifier: Modifier = Modifier) {
    val restaurantMapPosition = LatLng(
        restaurant?.latitude?.toDouble() ?: -6.0, restaurant?.longitude?.toDouble() ?: 100.0
    )
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(restaurantMapPosition, 1f)
    }
    GoogleMap(
        modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        Marker(
            state = MarkerState(position = restaurantMapPosition),
            title = restaurant?.name,
            snippet = "Marker in ${restaurant?.name}"
        )
    }
}
