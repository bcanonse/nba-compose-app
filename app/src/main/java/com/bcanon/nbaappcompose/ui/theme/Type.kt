package com.bcanon.nbaappcompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.bcanon.nbaappcompose.R

// Set of Material typography styles to start with

private val Montserrat = FontFamily(
    Font(R.font.montserrat_bold, FontWeight.W800),
    Font(R.font.montserrat_medium, FontWeight.W500),
    Font(R.font.montserrat_regular),
)

val Typography = Typography(
    defaultFontFamily = Montserrat,
    h1 = TextStyle(
        fontSize = 54.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.W800,
        fontSize = 52.sp
    ),
    h4 = TextStyle(
        fontWeight = FontWeight.W600,
        fontSize = 32.sp
    ),
    h5 = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 28.sp
    ),
    h6 = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 24.sp
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
)