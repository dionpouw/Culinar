package com.jeflette.culinar.ui.screen.commonui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.toggleable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MoodCategoryChip(
    mood: String,
    isSelected: Boolean = false,
    onSelectedCategoryChanged: (String) -> Unit,
    onExecuteSearch: () -> Unit,
) {
    Surface(
        modifier = Modifier.padding(end = 8.dp),
        shadowElevation = 8.dp,
        shape = MaterialTheme.shapes.medium,
        color = if (isSelected) MaterialTheme.colorScheme.secondaryContainer else MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier.toggleable(value = isSelected, onValueChange = {
                onSelectedCategoryChanged(mood)
                onExecuteSearch()
            })
        ) {
            Text(
                text = mood,
                style = MaterialTheme.typography.bodyMedium,
                color = if (isSelected) MaterialTheme.colorScheme.onSecondaryContainer else MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}