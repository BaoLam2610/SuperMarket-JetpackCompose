package com.lambao.supermarket.presentation.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.lambao.supermarket.R
import com.lambao.supermarket.domain.model.Banner
import com.lambao.supermarket.domain.model.MenuBoard
import com.lambao.supermarket.presentation.screen.home.components.BannerItem
import com.lambao.supermarket.presentation.screen.home.components.MenuBoardItem
import com.lambao.supermarket.presentation.screen.home.components.ProductSaleItem
import com.lambao.supermarket.presentation.ui.extension.circleLayout
import com.lambao.supermarket.presentation.ui.theme.ColorBlue
import com.lambao.supermarket.presentation.ui.theme.ColorCritical
import com.lambao.supermarket.presentation.ui.theme.ColorPrimary
import com.lambao.supermarket.presentation.ui.theme.ColorSecondary
import com.lambao.supermarket.presentation.ui.theme.Dimen
import com.lambao.supermarket.presentation.ui.theme.Elevation
import com.lambao.supermarket.presentation.ui.theme.IconSize
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(start = true)
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {
    val scrollState = rememberScrollState()
    var searchValue by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Spacer(modifier = Modifier.height(Dimen.large))
        LocationSection(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimen.horizontal),
            badgeCount = "10"
        )

        Spacer(modifier = Modifier.height(Dimen.medium))
        SearchSection(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimen.horizontal),
            value = searchValue,
            onValueChange = { searchValue = it })

        Spacer(modifier = Modifier.height(Dimen.medium))
        BannerSection(
            modifier = Modifier.fillMaxWidth(),
            banners = listOf(
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/free-vector/gradient-local-market-facebook-cover_23-2149462013.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
            )
        )

        Spacer(modifier = Modifier.height(Dimen.medium))
        MenuBoardSection(
            modifier = Modifier
                .fillMaxWidth(),
            menuBoards = listOf(
                MenuBoard(1, R.string.bl_super_market, R.drawable.ic_app_text),
                MenuBoard(1, R.string.member_card, R.drawable.ic_category_member_card),
                MenuBoard(1, R.string.check_price, R.drawable.ic_category_qr_scan),
                MenuBoard(1, R.string.store, R.drawable.ic_category_location),
                MenuBoard(1, R.string.flash_sale, R.drawable.ic_category_flash_sale),
                MenuBoard(1, R.string.coupon, R.drawable.ic_category_coupon),
                MenuBoard(1, R.string.category, R.drawable.ic_category_filled),
                MenuBoard(1, R.string.brand_store, R.drawable.ic_category_brand_store),
            )
        )
        Spacer(modifier = Modifier.height(Dimen.medium))
        ProductSaleSection(
            modifier = Modifier
                .fillMaxWidth(),
            productSales = listOf(
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/free-vector/gradient-local-market-facebook-cover_23-2149462013.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
            )
        )

        ProductSaleSection(
            modifier = Modifier
                .fillMaxWidth(),
            productSales = listOf(
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/free-vector/gradient-local-market-facebook-cover_23-2149462013.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
                Banner(
                    1,
                    "1",
                    "https://img.freepik.com/premium-vector/fresh-healthy-vegetable-market-online-facebook-cover-banner-premium-vector_640223-41.jpg"
                ),
            )
        )
    }
}

@Composable
fun LocationSection(
    modifier: Modifier = Modifier,
    badgeCount: String = "",
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Your location",
                style = MaterialTheme.typography.bodyMedium,
                color = ColorSecondary,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(Dimen.tiny))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = null,
                    tint = ColorPrimary
                )
                Spacer(modifier = Modifier.width(Dimen.small))
                Text(
                    text = "Pha Lai, Chi Linh, Hai Duong",
                    style = MaterialTheme.typography.displayMedium
                )
            }
        }

        ConstraintLayout {
            val (icon, badge) = createRefs()
            Icon(
                painter = painterResource(id = R.drawable.ic_notification),
                contentDescription = null,
                modifier = Modifier
                    .size(IconSize.large)
                    .constrainAs(icon) {
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        bottom.linkTo(parent.bottom)
                    }
            )
            Text(
                text = badgeCount,
                style = MaterialTheme.typography.labelSmall,
                color = Color.White,
                modifier = Modifier
                    .background(ColorCritical, CircleShape)
                    .circleLayout()
                    .padding(Dimen.extraTiny)
                    .constrainAs(badge) {
                        top.linkTo(parent.top)
                        end.linkTo(icon.end)
                    }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchSection(
    value: String,
    modifier: Modifier = Modifier,
    onValueChange: (String) -> Unit
) {
    Box(
        modifier = modifier.clip(MaterialTheme.shapes.small)
    ) {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            onValueChange = onValueChange,
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                placeholderColor = ColorBlue,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = ""
                )
            },
            textStyle = MaterialTheme.typography.bodyMedium,
            singleLine = true,
            placeholder = {
                Text(
                    text = "Search",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
        )

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BannerSection(
    modifier: Modifier = Modifier,
    banners: List<Banner>
) {
    val pagerState = rememberPagerState { banners.size }
    Column(modifier = modifier) {
        HorizontalPager(
            state = pagerState,
            contentPadding = PaddingValues(horizontal = Dimen.horizontal),
            modifier = Modifier
                .fillMaxWidth()

        ) { page ->
            BannerItem(banner = banners[page])
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MenuBoardSection(
    modifier: Modifier = Modifier,
    menuBoards: List<MenuBoard>
) {
    val itemSize: Dp = ((LocalConfiguration.current.screenWidthDp.dp) / 4)
    FlowRow(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier,
        maxItemsInEachRow = 4
    ) {
        menuBoards.forEach {
            MenuBoardItem(
                modifier = Modifier
                    .width(itemSize)
                    .padding(horizontal = 4.dp)
                    .padding(top = Dimen.small, bottom = Elevation.medium)
                    .aspectRatio(1f),
                menuBoard = it
            )
        }
    }
}

@Composable
fun ProductSaleSection(
    modifier: Modifier = Modifier,
    productSales: List<Banner>
) {
    LazyRow(modifier = modifier) {
        itemsIndexed(productSales) { index, item ->
            ProductSaleItem(productSale = item, position = index)
        }
    }
}