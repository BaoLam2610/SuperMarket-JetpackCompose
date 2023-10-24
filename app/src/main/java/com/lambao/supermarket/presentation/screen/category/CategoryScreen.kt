package com.lambao.supermarket.presentation.screen.category

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.lambao.supermarket.R
import com.lambao.supermarket.domain.model.Category
import com.lambao.supermarket.domain.model.Product
import com.lambao.supermarket.domain.model.Promotion
import com.lambao.supermarket.presentation.screen.category.components.CategoryItem
import com.lambao.supermarket.presentation.screen.home.SearchSection
import com.lambao.supermarket.presentation.screen.home.components.ProductItem
import com.lambao.supermarket.presentation.ui.theme.Dimen
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun CategoryScreen() {
    var searchValue by remember {
        mutableStateOf("")
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(Dimen.large))
        SearchSection(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimen.horizontal),
            value = searchValue,
            onValueChange = { searchValue = it })

        Spacer(modifier = Modifier.height(Dimen.medium))
        CategorySection(
            modifier = Modifier.fillMaxSize(),
            categories = listOf(
                Category(1, "Title 1", R.drawable.ic_app_text),
                Category(1, "Title 1", R.drawable.ic_category_member_card),
                Category(1, "Title 1", R.drawable.ic_category_qr_scan),
                Category(1, "Title 1", R.drawable.ic_category_location),
                Category(1, "Title 1", R.drawable.ic_category_flash_sale),
                Category(1, "Title 1", R.drawable.ic_category_coupon),
                Category(1, "Title 1", R.drawable.ic_category_filled),
                Category(1, "Title 1", R.drawable.ic_category_brand_store),
                Category(1, "Title 1", R.drawable.ic_category_brand_store),
                Category(1, "Title 1", R.drawable.ic_category_brand_store),
                Category(1, "Title 1", R.drawable.ic_category_brand_store),
                Category(1, "Title 1", R.drawable.ic_category_brand_store),
                Category(1, "Title 1", R.drawable.ic_category_brand_store),
            ),
            products = listOf(
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 3",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                ),
                Product(
                    1,
                    "Product 1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg",
                    1000000,
                    Promotion(1, 2.5f)
                )
            )
        )
    }
}

@Composable
fun HeaderSection(
    modifier: Modifier = Modifier
) {

}

@Composable
fun CategorySection(
    modifier: Modifier = Modifier,
    categories: List<Category>,
    products: List<Product>
) {
    val itemSize: Dp = ((LocalConfiguration.current.screenWidthDp.dp) / 5)
    Row(modifier) {
        LazyColumn(
            modifier = Modifier.fillMaxHeight(),
        ) {
            items(categories) {
                CategoryItem(
                    modifier = Modifier
                        .width(itemSize)
                        .aspectRatio(1f),
                    category = it
                )
            }
        }
        val state = rememberLazyGridState(initialFirstVisibleItemIndex = 0)
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Fixed(2),
            state = state,
        ) {
            items(products) {
                ProductItem(modifier = Modifier.padding(Dimen.normal), product = it)
            }
        }
    }
}

