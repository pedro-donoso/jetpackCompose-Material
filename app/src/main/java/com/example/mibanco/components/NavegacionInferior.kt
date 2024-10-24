package com.example.mibanco.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.mibanco.models.ItemsBottomNav.*

@Composable
fun NavegacionInferior(
    navHostController: NavHostController
) {
    val menuItems = listOf(
        ItemBottomNav1,
        ItemBottomNav2,
        ItemBottomNav3
    )
    BottomAppBar {
        NavigationBar {
            menuItems.forEach { item ->
                NavigationBarItem(selected = false,
                    onClick = { navHostController.navigate(item.ruta) },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    },
                    label = {
                        Text(text = item.title)
                    }
                )
            }
        }
    }
}





