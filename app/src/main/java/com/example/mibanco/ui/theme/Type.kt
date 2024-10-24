package com.example.mibanco.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mibanco.R

private val lea = FontFamily(
    Font(R.font.leaguespartan_light,
        FontWeight.Light
    ),
    Font(R.font.leaguespartan_regular,
        FontWeight.Normal
    ),
    Font(R.font.leaguespartan_semibold,
        FontWeight.SemiBold
    )
)

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = lea,
        fontWeight = FontWeight.Normal,
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        fontFamily = lea,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = lea,
        fontWeight = FontWeight.Light,
        fontSize = 20.sp
    ),



   /* bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )*/
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)