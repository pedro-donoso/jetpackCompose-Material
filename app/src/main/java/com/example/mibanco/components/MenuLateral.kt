package com.example.mibanco.components

import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.mibanco.models.ItemsMenuLateral.*
import com.example.mibanco.navigation.currentRoute

@Composable
fun MenuLateral(
    navController: NavHostController,
    drawerState: DrawerState,
    contenido: @Composable () -> Unit
) {
    val menuItems = listOf(
        ItemMenuLateral1,
        ItemMenuLateral2,
        ItemMenuLateral3,
        ItemMenuLateral4
    )
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                menuItems.forEach { item ->
                    NavigationDrawerItem(
                        label = { Text(text = item.title) },
                        selected = currentRoute(navController) == item.ruta,
                        onClick = {}
                    )
                }
            }
        }
    ) {
        contenido()
    }
}