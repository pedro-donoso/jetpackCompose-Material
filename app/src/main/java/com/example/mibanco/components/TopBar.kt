package com.example.mibanco.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CardGiftcard
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mibanco.MainViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    drawerState: DrawerState,
) {
    val mainViewModel: MainViewModel = viewModel()
    val scope = rememberCoroutineScope()

    CenterAlignedTopAppBar(
        title = { Text(text = "¡Hola!") },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    drawerState.open()
                }
            }) {
                Icon(
                    imageVector = Icons.Outlined.Menu,
                    contentDescription = "Abrir Menú Lateral" // Asegúrate de que el contenido sea descriptivo
                )
            }
        },
        actions = {
            IconButton(onClick = {
                mainViewModel.showDialogRecompensas = true
            }) {
                Icon(
                    imageVector = Icons.Outlined.CardGiftcard,
                    contentDescription = "Ir a Recompensas" // Descripción del ícono
                )
            }

            IconButton(onClick = {
                mainViewModel.showBottomSheet = true
            }) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "Ir a Configuración" // Descripción del ícono
                )
            }
        }
    )
}