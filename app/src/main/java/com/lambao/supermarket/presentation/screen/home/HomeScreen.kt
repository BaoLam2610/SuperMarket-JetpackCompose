package com.lambao.supermarket.presentation.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lambao.supermarket.presentation.screen.destinations.ProductDetailScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {
    Box(modifier = Modifier.fillMaxSize().clickable {
        navigator.navigate(ProductDetailScreenDestination)
    }) {
        Text(text = "Home Screen")
    }
}