package com.example.mibanco.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AttachMoney
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.PriceCheck
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.mibanco.navigation.NavScreen

sealed class ItemsBottomNav(
    var icon: ImageVector,
    var title: String,
    var ruta: String
) {
    data object ItemBottomNav1 : ItemsBottomNav(
        Icons.Outlined.AttachMoney,
        "Transferencias",
        NavScreen.Transferencias.name
    )

    data object ItemBottomNav2 : ItemsBottomNav(
        Icons.Outlined.PriceCheck,
        "Pagar Servicios",
        NavScreen.Transferencias.name
    )

    data object ItemBottomNav3 : ItemsBottomNav(
        Icons.Outlined.CreditCard,
        "Pagar Tarjetas",
        NavScreen.Transferencias.name
    )
}


