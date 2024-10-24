package com.example.mibanco.screens

import android.content.Intent
import android.util.Log
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mibanco.MainActivity
import com.example.mibanco.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen() {

    val context = LocalContext.current
    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.9f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(8f)
                        .getInterpolation(it)
                }
            )
        )
        delay(1000L)
        val intent = Intent(
            context,
            MainActivity::class.java
        )
        context.startActivity(intent)
    }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .scale(scale.value)
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
            onClick = { Log.d("SplashScreen", "Clic en continuar")
                val intent = Intent(
                    context, MainActivity::class.java
                )
                context.startActivity(intent)
            }) {
            Text(
                text = "Continuar",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.secondaryContainer
            )
        }
    }
}