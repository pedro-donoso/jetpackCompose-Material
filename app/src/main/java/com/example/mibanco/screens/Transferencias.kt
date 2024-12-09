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
fun Transferencias() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally // Alineación horizontal centrada
    ) {
        Image(
            painter = painterResource(id = R.drawable.money_transfer),
            contentDescription = "Ilustración de transferencia de dinero",
            modifier = Modifier.padding(bottom = 16.dp) // Agregar relleno debajo de la imagen
        )
        Text(
            text = "Transferencias",
            style = MaterialTheme.typography.titleLarge, // Usar MaterialTheme para el estilo
            modifier = Modifier.padding(horizontal = 16.dp) // Agregar relleno horizontal
        )
        Text(
            text = "Realiza transferencias de manera rápida y segura a cualquier cuenta bancaria.",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp) // Relleno alrededor del texto
                .align(Alignment.CenterHorizontally) // Alinear el texto al centro horizontalmente
        )
        Button(
            onClick = { /* Acción para iniciar la transferencia */ },
            modifier = Modifier.padding(top = 16.dp) // Relleno superior para el botón
        ) {
            Text(text = "Transferir")
        }
    }
}