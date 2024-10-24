package com.example.mibanco.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mibanco.models.ItemsPrincipal


@Composable
fun HomeScreen() {
    val listaItemsPrincipal = listOf(
        ItemsPrincipal.ItemPrincipal1,
        ItemsPrincipal.ItemPrincipal2,
        ItemsPrincipal.ItemPrincipal3,
        ItemsPrincipal.ItemPrincipal4,
        ItemsPrincipal.ItemPrincipal5
    )

    LazyColumn(
        modifier = Modifier
            .padding(top = 40.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(listaItemsPrincipal) { item ->
            ListItemRow(item)
            HorizontalDivider()
        }
    }
}

@Composable
fun ListItemRow(item: ItemsPrincipal) {

    val masInfo = remember {
        mutableStateOf(false)
    }

    Column (
        modifier = Modifier
            .animateContentSize (
                animationSpec = tween(240, 0, LinearEasing)
            )
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f)
            )
            IconButton(onClick = { masInfo.value = !masInfo.value }) {
                Icon(
                    if (masInfo.value) Icons.Default.Remove else Icons.Default.Add,
                    contentDescription = "Más información"
                )
            }
        }
    }
    if (masInfo.value) {
        Row {
            Text(
                text = item.details,
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}


