package com.lambao.supermarket.domain.model

data class Product(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val price: Long,
    val promotion: Promotion,
) {
    fun getDiscountPrice() = price * promotion.discount
}

data class Promotion(
    val id: Int,
    val discount: Float
)
