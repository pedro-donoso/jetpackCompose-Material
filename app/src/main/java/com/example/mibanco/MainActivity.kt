package com.example.mibanco

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CardGiftcard
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mibanco.components.MenuLateral
import com.example.mibanco.components.NavegacionInferior
import com.example.mibanco.navigation.BancoNavigation
import com.example.mibanco.ui.theme.MiBancoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiBancoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun MainScreen() {
        val navController = rememberNavController()
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val mainViewModel = remember { MainViewModel() }

        MenuLateral(navController = navController, drawerState = drawerState) {
            Contenido(navController, drawerState, mainViewModel)
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun TopBar(drawerState: DrawerState, onRewardsClick: () -> Unit) {
        TopAppBar(
            title = { Text("Mi Banco") },
            actions = {
                Icon(
                    imageVector = Icons.Outlined.CardGiftcard,
                    contentDescription = "Recompensas",
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 16.dp)
                        .clickable { onRewardsClick() }
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.inversePrimary, // Cambia el color de fondo aquí
                titleContentColor = MaterialTheme.colorScheme.inverseSurface, // Color del texto del título
                actionIconContentColor = MaterialTheme.colorScheme.inverseSurface// Color de los iconos de acción
            )
        )
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Contenido(
        navController: NavHostController,
        drawerState: DrawerState,
        mainViewModel: MainViewModel
    ) {
        Scaffold(
            topBar = {
                TopBar(drawerState) {
                    mainViewModel.showDialogRecompensas = true
                }
            },
            bottomBar = { NavegacionInferior(navController) }
        ) { padding ->
            Box(modifier = Modifier
                .padding(padding)
                .fillMaxSize()) {
                BancoNavigation(navController)

                if (mainViewModel.showBottomSheet) {
                    ModalBottomSheet(onDismissRequest = { mainViewModel.showBottomSheet = false }) {
                        ContentBottomSheet(navController, mainViewModel)
                    }
                }

                if (mainViewModel.showDialogRecompensas) {
                    DialogoRecompensas(mainViewModel)
                }
            }
        }
    }

    @Composable
    private fun ContentBottomSheet(navController: NavHostController, mainViewModel: MainViewModel) {

    }

    @Composable
    fun DialogoRecompensas(mainViewModel: MainViewModel) {
        AlertDialog(
            icon = {
                Icon(Icons.Outlined.CardGiftcard, null, modifier = Modifier.size(48.dp))
            },
            title = { Text("Recompensas") },
            text = { Text("Esta opción estará disponible muy pronto.") },
            onDismissRequest = { mainViewModel.showDialogRecompensas = false },
            confirmButton = {
                TextButton(
                    onClick = { mainViewModel.showDialogRecompensas = false },
                    colors = androidx.compose.material3.ButtonDefaults.textButtonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Text(text = "Cerrar")
                }
            }
        )
    }
}


