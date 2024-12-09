package com.example.mibanco.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mibanco.R
import com.example.mibanco.models.ItemsMenuLateral.ItemMenuLateral1
import com.example.mibanco.models.ItemsMenuLateral.ItemMenuLateral2
import com.example.mibanco.models.ItemsMenuLateral.ItemMenuLateral3
import com.example.mibanco.models.ItemsMenuLateral.ItemMenuLateral4
import com.example.mibanco.navigation.currentRoute
import kotlinx.coroutines.launch

@Composable
fun MenuLateral(
    navController: NavHostController,
    drawerState: DrawerState,
    contenido: @Composable () -> Unit
) {
    val scope = rememberCoroutineScope()
    val menuItems = listOf(
        ItemMenuLateral1,
        ItemMenuLateral2,
        ItemMenuLateral3,
        ItemMenuLateral4
    )
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = MaterialTheme.colorScheme.inversePrimary
            ) {

                Image(
                    painter = painterResource(id = R.drawable.bank),
                    contentDescription = null,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(start = 16.dp)
                )
                menuItems.forEach { item ->
                    NavigationDrawerItem(
                        modifier = Modifier
                            .padding(6.dp),
                        icon = {
                            Icon(item.icon, null)
                        },
                        label = { Text(text = item.title) },
                        selected = currentRoute(navController) == item.ruta,
                        onClick = {
                            scope.launch {
                                drawerState.close()
                            }
                            navController.navigate(item.ruta)
                        }
                    )
                }
            }
        }
    ) {
        contenido()
    }
}