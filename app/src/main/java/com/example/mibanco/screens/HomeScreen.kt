package com.example.mibanco.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    Row(
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = item.title,
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.weight(1f)
        )
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Add,
                contentDescription = "Más información")
        }
    }
}


