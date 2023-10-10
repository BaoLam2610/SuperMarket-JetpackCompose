package com.lambao.supermarket.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.lambao.supermarket.presentation.screen.NavGraphs
import com.lambao.supermarket.presentation.screen.destinations.AccountScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.BrandStoreScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.CartScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.CategoryScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.HomeScreenDestination
import com.lambao.supermarket.presentation.ui.theme.Dimen
import com.ramcosta.composedestinations.DestinationsNavHost


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetupNavigation() {
    val navController = rememberNavController()
    val paddingBottom = Dimen.xLarge
    Scaffold(
        bottomBar = {
            if (showBottomBar(navController = navController))
                BottomBar(
                    modifier = Modifier.offset(y = paddingBottom),
                    navController = navController
                )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(bottom = innerPadding.calculateBottomPadding() - paddingBottom)) {
            NavHost(navController = navController)
        }
    }
}

@Composable
fun NavHost(
    navController: NavHostController
) {
    DestinationsNavHost(
        navGraph = NavGraphs.root,
        navController = navController
    )
}

@Composable
fun showBottomBar(navController: NavHostController): Boolean {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    return if (currentRoute == null) true
    else currentRoute == HomeScreenDestination.route ||
            currentRoute == CategoryScreenDestination.route ||
            currentRoute == BrandStoreScreenDestination.route ||
            currentRoute == CartScreenDestination.route ||
            currentRoute == AccountScreenDestination.route
}