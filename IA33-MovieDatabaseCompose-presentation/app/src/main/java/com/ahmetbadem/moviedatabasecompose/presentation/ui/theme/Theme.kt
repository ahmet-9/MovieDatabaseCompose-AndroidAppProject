package com.ahmetbadem.moviedatabasecompose.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.ahmetbadem.moviedatabasecompose.presentation.ui.theme.Typography
import com.ahmetbadem.moviedatabasecompose.presentation.ui.theme.Purple200
import com.ahmetbadem.moviedatabasecompose.presentation.ui.theme.Purple500
import com.ahmetbadem.moviedatabasecompose.presentation.ui.theme.Purple700
import com.ahmetbadem.moviedatabasecompose.presentation.ui.theme.Teal200
import com.ahmetbadem.moviedatabasecompose.presentation.ui.theme.Shapes

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MovieDatabaseComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}