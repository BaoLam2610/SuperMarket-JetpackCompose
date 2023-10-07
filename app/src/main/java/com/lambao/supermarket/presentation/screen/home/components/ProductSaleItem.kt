package com.lambao.supermarket.presentation.screen.home.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.AsyncImage
import com.lambao.supermarket.domain.model.Banner
import com.lambao.supermarket.presentation.ui.theme.ColorPrimary
import com.lambao.supermarket.presentation.ui.theme.Dimen

@Composable
fun ProductSaleItem(
    modifier: Modifier = Modifier,
    productSale: Banner,
    position: Int
) {
    ConstraintLayout(
        modifier = modifier
            .padding(
                start = if (position == 0) Dimen.normal else 0.dp,
                end = Dimen.normal,
                bottom = Dimen.extraTiny
            )
    ) {
        val (item, buttonBuy) = createRefs()
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .aspectRatio(0.9f)
                .clip(MaterialTheme.shapes.medium)
                .constrainAs(item) {
                    top.linkTo(parent.top)
                }
        ) {
            AsyncImage(
                model = productSale.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
        }

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White
            ),
            modifier = Modifier
                .constrainAs(buttonBuy) {
                    top.linkTo(item.bottom)
                    bottom.linkTo(item.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            contentPadding = PaddingValues(
                horizontal = Dimen.medium,
            ),
            elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = Dimen.tiny)
        ) {
            Text(
                text = "Buy now",
                style = MaterialTheme.typography.displayMedium,
                color = ColorPrimary,
            )
        }
    }

}