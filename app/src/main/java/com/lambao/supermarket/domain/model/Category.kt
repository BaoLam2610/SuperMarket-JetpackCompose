package com.lambao.supermarket.domain.model

import androidx.annotation.DrawableRes

data class Category(
    val id: Int,
    val name: String,
    @DrawableRes val logo: Int
)
