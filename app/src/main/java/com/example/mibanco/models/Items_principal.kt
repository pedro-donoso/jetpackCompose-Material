package com.example.mibanco.models

sealed class ItemsPrincipal(
    var title: String,
    var details: String
) {
    data object ItemPrincipal1 : ItemsPrincipal(
        "Cuentas",
        "Consulta y administra todas tus cuentas bancarias, incluyendo cuentas de ahorro, cuentas corrientes y más. Accede a los movimientos, balances y detalles de cada cuenta en tiempo real."
    )

    data object ItemPrincipal2 : ItemsPrincipal(
        "Tarjetas de crédito",
        "Gestiona todas tus tarjetas de crédito, revisa tus saldos, realiza pagos, consulta tu límite de crédito y los movimientos recientes. También podrás ver las recompensas acumuladas y tus fechas de corte."
    )

    data object ItemPrincipal3 : ItemsPrincipal(
        "Recompensas",
        "Consulta el saldo y las ofertas disponibles de tus programas de recompensas, ya sea por puntos acumulados, cashback o descuentos especiales. Canjea tus recompensas por productos, viajes u otros beneficios."
    )

    data object ItemPrincipal4 : ItemsPrincipal(
        "Inversiones",
        "Accede a tu portafolio de inversiones, incluyendo acciones, bonos, fondos mutuos y más. Consulta el rendimiento de tus inversiones, realiza nuevos depósitos o realiza un seguimiento de tus resultados."
    )

    data object ItemPrincipal5 : ItemsPrincipal(
        "Créditos",
        "Gestiona los préstamos que hayas solicitado, incluyendo créditos personales, hipotecarios o automotrices. Consulta los saldos pendientes, las tasas de interés, las fechas de pago y realiza pagos anticipados."
    )
}



