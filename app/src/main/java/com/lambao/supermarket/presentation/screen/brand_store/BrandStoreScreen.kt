package com.lambao.supermarket.presentation.screen.brand_store

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun BrandStoreScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "BrandStoreScreen")
    }
}