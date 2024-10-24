package com.example.mibanco.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.mibanco.models.ItemsBottomNav.*
import com.example.mibanco.navigation.currentRoute

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
                val selected = currentRoute(navHostController) == item.ruta
                NavigationBarItem(
                    selected = selected,
                    onClick = {
                        // Navigate only if the selected item is different
                        if (!selected) {
                            navHostController.navigate(item.ruta) {
                                // Optionally clear the back stack or configure navigation options
                                launchSingleTop = true
                                restoreState = true
                                // You can add more navigation options here
                            }
                        }
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title // Ensure this is meaningful for accessibility
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




