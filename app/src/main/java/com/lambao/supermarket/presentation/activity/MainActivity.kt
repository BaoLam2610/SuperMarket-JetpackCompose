package com.lambao.supermarket.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.lambao.supermarket.presentation.navigation.SetupNavigation
import com.lambao.supermarket.presentation.ui.theme.SuperMarketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperMarketTheme(darkTheme = false) {
                SetupNavigation()
            }
        }
    }
}