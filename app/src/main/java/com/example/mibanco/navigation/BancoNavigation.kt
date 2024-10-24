package com.example.mibanco.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mibanco.screens.HomeScreen
import com.example.mibanco.screens.PagarServicios
import com.example.mibanco.screens.PagarTarjetas
import com.example.mibanco.screens.Transferencias


@Composable
fun BancoNavigation(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = NavScreen.HomeScreen.name
    ){
        composable(NavScreen.HomeScreen.name){
            HomeScreen()
        }
        composable(NavScreen.Transferencias.name){
            Transferencias()
        }
        composable(NavScreen.PagarServicios.name){
            PagarServicios()
        }
        composable(NavScreen.PagarTarjetas.name){
            PagarTarjetas()
        }
    }
}


