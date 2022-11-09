package com.jeflette.culinar.screen.commonui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.jeflette.culinar.data.local.entity.Restaurant
import com.jeflette.culinar.screen.homescreen.HomeScreenViewModel
import com.jeflette.culinar.ui.theme.interFamily
import com.jeflette.culinar.util.MoodState
import com.jeflette.culinar.util.fakeMood


@Composable
fun HomeScreenContent(modifier: Modifier, viewModel: HomeScreenViewModel) {
    val restaurants by viewModel.restaurantList.collectAsState()
    viewModel.getRestaurantList(MoodState.Happy.name.lowercase())
    Column(
        modifier = modifier,
    ) {
        Text(
            "Top Picks",
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold,
            fontFamily = interFamily,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(fakeMood()) { item ->
                Text(
                    item,
                    Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(MaterialTheme.colorScheme.secondaryContainer)
                        .padding(8.dp),
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            (items(restaurants) { item ->
                RestaurantCard(restaurant = item)
            })
        }
    }
}


@Composable
fun RestaurantCard(
    restaurant: Restaurant, //onClickToDetailL: () -> Unit
) {
    Card {
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

            restaurant.name?.let {
                Text(
                    text = it,
                    modifier = Modifier.padding(8.dp),
                    maxLines = 1,
                    fontFamily = interFamily,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onPrimaryContainer
                )
            }
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