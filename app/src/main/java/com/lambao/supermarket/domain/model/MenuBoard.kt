package com.lambao.supermarket.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class MenuBoard(
    val type: Int,
    @StringRes val title: Int,
    @DrawableRes val logo: Int
)