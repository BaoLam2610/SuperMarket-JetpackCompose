package com.lambao.supermarket.presentation.screen.category

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun CategoryScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "CategoryScreen")
    }
}