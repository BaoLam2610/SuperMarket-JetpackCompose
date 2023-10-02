package com.lambao.supermarket.presentation.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalAbsoluteTonalElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.lambao.supermarket.R
import com.lambao.supermarket.presentation.screen.NavGraphs
import com.lambao.supermarket.presentation.screen.appCurrentDestinationAsState
import com.lambao.supermarket.presentation.screen.destinations.AccountScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.BrandStoreScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.CartScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.CategoryScreenDestination
import com.lambao.supermarket.presentation.screen.destinations.HomeScreenDestination
import com.lambao.supermarket.presentation.screen.startAppDestination
import com.lambao.supermarket.presentation.ui.theme.ColorCritical
import com.lambao.supermarket.presentation.ui.theme.ColorPrimary
import com.lambao.supermarket.presentation.ui.theme.ColorSecondary
import com.lambao.supermarket.presentation.ui.theme.Dimen
import com.lambao.supermarket.presentation.ui.theme.IconSize
import com.ramcosta.composedestinations.navigation.navigate
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec

enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    @StringRes val label: Int,
    @DrawableRes val selectedIcon: Int,
    @DrawableRes val unselectedIcon: Int,
    val badgeCount: String? = null
) {
    Home(
        HomeScreenDestination,
        R.string.home,
        R.drawable.ic_home_filled,
        R.drawable.ic_home,
    ),

    Category(
        CategoryScreenDestination,
        R.string.category,
        R.drawable.ic_store_details_filled,
        R.drawable.ic_store_details
    ),

    BrandStore(
        BrandStoreScreenDestination,
        R.string.brand_store,
        R.drawable.ic_products_ticket_filled,
        R.drawable.ic_products_ticket
    ),

    Cart(
        CartScreenDestination,
        R.string.cart,
        R.drawable.ic_cart_filled,
        R.drawable.ic_cart,
        "10"
    ),

    Account(
        AccountScreenDestination,
        R.string.account,
        R.drawable.ic_customers_filled,
        R.drawable.ic_customers
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBar(
    navController: NavController
) {
    val currentDestination = navController.appCurrentDestinationAsState().value
        ?: NavGraphs.root.startAppDestination

    NavigationBar {
        BottomBarDestination.values().forEach { item ->
            NavigationBarItem(
                selected = currentDestination == item.direction,
                onClick = {
                    navController.navigate(item.direction) {
                        launchSingleTop = true
                    }
                },
                label = {
                    Text(
                        text = stringResource(id = item.label),
                        style = MaterialTheme.typography.labelMedium,
                        color = if (currentDestination == item.direction) ColorPrimary
                        else ColorSecondary
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = ColorPrimary,
                    unselectedIconColor = ColorSecondary,
                    selectedTextColor = ColorPrimary,
                    unselectedTextColor = ColorSecondary,
                    indicatorColor = MaterialTheme.colorScheme
                        .surfaceColorAtElevation(LocalAbsoluteTonalElevation.current)
                ),
                icon = {
                    BadgedBox(badge = {
                        if (item.badgeCount != null)
                            Badge(
                                modifier = Modifier.padding(top = Dimen.medium),
                                containerColor = ColorCritical
                            ) {
                                Text(
                                    text = item.badgeCount,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = Color.White,
                                )
                            }
                    }) {
                        Icon(
                            painter =
                            painterResource(
                                id = if (currentDestination == item.direction) item.selectedIcon
                                else item.unselectedIcon
                            ),
                            contentDescription = null,
                            modifier = Modifier.size(IconSize.large)
                        )
                    }
                }
            )
        }
    }
}
