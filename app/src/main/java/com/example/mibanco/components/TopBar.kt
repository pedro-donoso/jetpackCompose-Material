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
    drawerState: @Composable DrawerState,
    function: @Composable () -> Unit,
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
                    Icons.Outlined.Menu,
                    "Abrir Menú Lateral"
                )
            }
        },

        actions = {
            IconButton(onClick = {
                mainViewModel.showDialogRecompensas = true
            }) {
                Icon(
                    Icons
                        .Outlined
                        .CardGiftcard,
                    "Ir " + "a Recompensas"
                )
            }

            IconButton(onClick = {
                mainViewModel.showBottomSheet = true
            }) {
                Icon(
                    Icons
                        .Outlined
                        .Settings,
                    "Ir a Configuración"
                )
            }

        }
    )
}
