package com.jeflette.culinar.ui.screen.commonui

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.jeflette.culinar.R
import com.jeflette.culinar.ui.theme.interFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar(
) {
    TopAppBar(
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            MaterialTheme.colorScheme.secondaryContainer,
        ), title = {
            Text(
                text = stringResource(id = R.string.app_name),
                fontFamily = interFamily,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                style = MaterialTheme.typography.displaySmall,
            )
        })
}