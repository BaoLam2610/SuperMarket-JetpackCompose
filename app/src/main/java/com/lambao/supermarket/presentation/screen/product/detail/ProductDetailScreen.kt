package com.lambao.supermarket.presentation.screen.product.detail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun ProductDetailScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable {

        }) {
        Text(text = "ProductDetailScreen")
    }
}