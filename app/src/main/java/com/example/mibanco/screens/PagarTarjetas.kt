package com.example.mibanco.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.mibanco.R

@Composable
fun PagarTarjetas() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.atm_card),
            contentDescription = "Ilustración de pago de tarjetas",
            modifier = Modifier.padding(bottom = 16.dp) // Relleno debajo de la imagen
        )
        Text(
            text = "Pagar Tarjetas",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 8.dp) // Relleno debajo del título
        )
        Text(
            text = "Realiza el pago de tus tarjetas de crédito y débito de manera rápida y segura. " +
                    "Selecciona la tarjeta que deseas pagar y sigue las instrucciones.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp
            ) // Relleno alrededor del texto
        )
        Button(
            onClick = { /* Acción para iniciar el pago de tarjetas */ },
            modifier = Modifier.padding(top = 16.dp) // Relleno superior para el botón
        ) {
            Text(text = "Iniciar Pago")
        }
    }
}