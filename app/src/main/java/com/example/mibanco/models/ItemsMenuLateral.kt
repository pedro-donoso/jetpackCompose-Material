package com.example.mibanco.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.PriceCheck
import androidx.compose.material.icons.outlined.RealEstateAgent
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mibanco.navigation.NavScreen

sealed class ItemsMenuLateral(
    val icon: ImageVector,
    val title: String,
    val ruta: String
){
    data object ItemMenuLateral1 : ItemsMenuLateral(
        Icons.Outlined.RealEstateAgent,
        "Consulta de saldos",
        NavScreen.HomeScreen.name
    )
    data object ItemMenuLateral2 : ItemsMenuLateral(
        Icons.Outlined.CreditCard,
        "Pagar tarjetas",
        NavScreen.PagarTarjetas.name
    )
    data object ItemMenuLateral3 : ItemsMenuLateral(
        Icons.Outlined.PriceCheck,
        "Pagar servicios",
        NavScreen.PagarServicios.name
    )
    data object ItemMenuLateral4 : ItemsMenuLateral(
        Icons.Outlined.AttachMoney,
        "Transferencias",
        NavScreen.Transferencias.name
    )

}