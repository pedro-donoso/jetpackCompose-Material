package com.example.mibanco.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

    LazyColumn {
        items(listaItemsPrincipal) { item ->
            ListItemRow(item)
        }
    }
}

@Composable
fun ListItemRow(item: ItemsPrincipal) { // Cambia aquí también para que coincida
    Text(
        text = item.title,
        style = MaterialTheme.typography.titleMedium
    )
}


