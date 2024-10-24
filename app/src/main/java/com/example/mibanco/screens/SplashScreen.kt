package com.example.mibanco.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mibanco.R

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.bank),
            contentDescription = "Logo"
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Bienvenido a Mi Banco",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primaryContainer
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            //mensaje se ve en logcat
            onClick = { Log.d("SplashScreen", "Iniciar Sesion") }) {
            Text(
                text = "Continuar",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.secondaryContainer
            )
        }
    }
}