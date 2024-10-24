package com.example.mibanco.models

sealed class ItemsPrincipal(
    var image: Int?,
    var title: String,
    var details: String
) {
    data object ItemPrincipal1 : ItemsPrincipal(
        null,
        "Cuentas",
        "Detalle cuenta 1"
    )

    data object ItemPrincipal2 : ItemsPrincipal(
        null,
        "Tarjetas de crédito",
        "Detalle tarjeta 1"
    )

    data object ItemPrincipal3 : ItemsPrincipal(
        null,
        "Recompensas",
        "Detalle recompensas 1"
    )

    data object ItemPrincipal4 : ItemsPrincipal(
        null,
        "Inversiones",
        "Detalle inversión 1"
    )

    data object ItemPrincipal5 : ItemsPrincipal(
        null,
        "Créditos",
        "Detalle crédito 1"
    )
}


