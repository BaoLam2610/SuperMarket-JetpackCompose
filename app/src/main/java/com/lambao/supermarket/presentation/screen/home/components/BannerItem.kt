package com.lambao.supermarket.presentation.screen.home.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.lambao.supermarket.domain.model.Banner
import com.lambao.supermarket.presentation.ui.theme.Dimen

@Composable
fun BannerItem(
    modifier: Modifier = Modifier, banner: Banner
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
            .height(150.dp)
            .padding(horizontal = Dimen.normal)
    /*.graphicsLayer {
            val pageOffset = (
                    (pagerState.currentPage - page) + pagerState
                        .currentPageOffsetFraction
                    ).absoluteValue
            alpha = lerp(
                start = 0.95f,
                stop = 1f,
                fraction = 1f - pageOffset.coerceIn(0f, 1f)
            ).also {
                scaleX = it
                scaleY = it
            }
        }*/
    ) {
        AsyncImage(
            model = banner.imageUrl,//ImageRequest.Builder(LocalContext.current).data(banner.imageUrl).build(),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxWidth()
        )
    }
}