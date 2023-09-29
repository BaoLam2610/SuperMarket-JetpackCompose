package com.lambao.supermarket.presentation.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.lambao.supermarket.R

private val interTightFont =
    listOf(
        androidx.compose.ui.text.font.Font(R.font.regular, FontWeight.Normal),
        androidx.compose.ui.text.font.Font(R.font.medium, FontWeight.Medium),
        androidx.compose.ui.text.font.Font(R.font.bold, FontWeight.Bold),
        androidx.compose.ui.text.font.Font(R.font.italic, FontWeight.Normal, FontStyle.Italic),
    )

private val fontFamily = FontFamily(interTightFont)

object TextStyle {
    val Regular10 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily,
        fontSize = Font.normal,
        color = ColorText
    )

    val Regular12 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily,
        fontSize = Font.extraNormal,
        color = ColorText
    )

    val Regular14 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily,
        fontSize = Font.default,
        color = ColorText
    )

    val Regular16 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily,
        fontSize = Font.medium,
        color = ColorText
    )

    val Regular18 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontFamily = fontFamily,
        fontSize = Font.extraMedium,
        color = ColorText
    )

    val Bold10 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = fontFamily,
        fontSize = Font.normal,
        color = ColorText
    )

    val Bold12 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = fontFamily,
        fontSize = Font.extraNormal,
        color = ColorText
    )

    val Bold14 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = fontFamily,
        fontSize = Font.default,
        color = ColorText
    )

    val Bold16 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = fontFamily,
        fontSize = Font.medium,
        color = ColorText
    )

    val Bold18 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontFamily = fontFamily,
        fontSize = Font.extraMedium,
        color = ColorText
    )
}
