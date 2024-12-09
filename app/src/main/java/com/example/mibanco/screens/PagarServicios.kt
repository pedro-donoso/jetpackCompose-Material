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
fun PagarServicios() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.money),
            contentDescription = "Ilustración de pago de servicios",
            modifier = Modifier.padding(bottom = 16.dp) // Relleno debajo de la imagen
        )
        Text(
            text = "Pagar Servicios",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 8.dp) // Relleno debajo del título
        )
        Text(
            text = "Realiza tus pagos de servicios de manera rápida y segura. " +
                    "Selecciona el servicio que deseas pagar y sigue las instrucciones.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp
            ) // Relleno alrededor del texto
        )
        Button(
            onClick = { /* Acción para iniciar el pago de servicios */ },
            modifier = Modifier.padding(top = 16.dp) // Relleno superior para el botón
        ) {
            Text(text = "Pago Automático")
        }
    }
}