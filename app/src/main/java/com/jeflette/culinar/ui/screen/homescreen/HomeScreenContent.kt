package com.jeflette.culinar.ui.screen.homescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.ui.screen.commonui.MoodCategoryChip
import com.jeflette.culinar.ui.theme.interFamily
import com.jeflette.culinar.util.fakeMood

@Composable
fun HomeScreenContent(
    showDetailRestaurantPage: (restaurantAddress: String) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeScreenViewModel
) {
    // For Tab row
//    viewModel.setMoodState(MoodState.Bored)
//    viewModel.getRestaurantList(viewModel.moodState.collectAsState().value)
    val restaurants by viewModel.restaurantList.collectAsState()
    val selectedCategory by viewModel.moodState.collectAsState()
    Column(
        modifier = modifier.padding(top = 8.dp, start = 8.dp, end = 8.dp)
    ) {
        Text(
            "Top Picks",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold,
            fontFamily = interFamily,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Add horizontal pager here
        LazyRow() {
            items(fakeMood()) { mood ->
                MoodCategoryChip(
                    mood = mood,
                    isSelected = selectedCategory == mood,
                    onSelectedCategoryChanged = {
                        viewModel.onSelectedCategoryChanged(it)
                    },
                    onExecuteSearch = viewModel::getRestaurantList,
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))
        if (restaurants.isEmpty()) {
            Text(
                "Loading...",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold,
                fontFamily = interFamily,
                color = MaterialTheme.colorScheme.onBackground
            )
        } else {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(restaurants) { restaurant ->
                    RestaurantCard(restaurant = restaurant,
                        showDetailRestaurantPage = { showDetailRestaurantPage(restaurant.address) })
                }
            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantCard(
    restaurant: Restaurant, showDetailRestaurantPage: (restaurant: Restaurant) -> Unit
) {
    Card(onClick = { showDetailRestaurantPage(restaurant) }) {
        Column(
            modifier = Modifier.background(MaterialTheme.colorScheme.primaryContainer)
        ) {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = "restaurant",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(125.dp)
            )
            Text(
                text = restaurant.name ?: "",
                modifier = Modifier.padding(8.dp),
                maxLines = 1,
                fontFamily = interFamily,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onPrimaryContainer
            )
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp, start = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = Modifier.weight(0.5f),
                    text = "Happy",
                    maxLines = 1,
                    fontFamily = interFamily,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
                Box(
                    modifier = Modifier.weight(0.5f),
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = "Rating",
                            tint = Color.Yellow
                        )
                        restaurant.rating?.let {
                            Text(
                                text = it,
                                fontFamily = interFamily,
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onPrimaryContainer
                            )
                        }
                    }
                }
            }
        }
    }
}