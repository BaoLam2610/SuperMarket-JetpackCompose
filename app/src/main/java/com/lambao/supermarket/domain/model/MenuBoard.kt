package com.lambao.supermarket.domain.model

import androidx.annotation.DrawableRes

data class MenuBoard(
    val type: Int,
    val title: String,
    @DrawableRes val logo: Int
)