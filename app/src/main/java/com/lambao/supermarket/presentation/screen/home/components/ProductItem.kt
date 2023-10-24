package com.lambao.supermarket.presentation.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.AsyncImage
import com.lambao.supermarket.common.addEmptyLines
import com.lambao.supermarket.common.castToDiscount
import com.lambao.supermarket.common.castToMoney
import com.lambao.supermarket.domain.model.Product
import com.lambao.supermarket.presentation.ui.theme.ColorCritical
import com.lambao.supermarket.presentation.ui.theme.ColorPrimary
import com.lambao.supermarket.presentation.ui.theme.ColorSecondary
import com.lambao.supermarket.presentation.ui.theme.Dimen

@Composable
fun ProductItem(
    modifier: Modifier = Modifier,
    product: Product
) {
    ConstraintLayout(
        modifier = modifier
            .clip(MaterialTheme.shapes.extraSmall)
            .background(Color.White)
    ) {
        val (item, discount) = createRefs()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(MaterialTheme.shapes.extraSmall)
                .constrainAs(item) {
                    top.linkTo(parent.top)
                },

            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AsyncImage(
                model = product.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.8f)
            )
            Spacer(modifier = Modifier.height(Dimen.tiny))

            Text(
                text = product.price.castToMoney(),
                style = MaterialTheme.typography.titleSmall,
                color = ColorPrimary
            )

            Text(
                text = product.getDiscountPrice().castToMoney(),
                style = MaterialTheme.typography.labelMedium,
                color = ColorSecondary,
                textDecoration = TextDecoration.LineThrough
            )

            Text(
                text = product.name.addEmptyLines(2),
                style = MaterialTheme.typography.displaySmall,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                textAlign = TextAlign.Start
            )

            Spacer(modifier = Modifier.weight(1f))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = Dimen.horizontal)
                    .padding(vertical = Dimen.extraSmall)
                    .clip(MaterialTheme.shapes.medium)
                    .background(ColorCritical)
                    .padding(vertical = Dimen.small),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Thêm vào giỏ",
                    style = MaterialTheme.typography.labelMedium,
                    color = Color.White,
                )
            }
            Spacer(modifier = Modifier.weight(1f))
        }

        Text(
            text = product.promotion.discount.castToDiscount(),
            style = MaterialTheme.typography.labelSmall,
            color = Color.White,
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = Dimen.extraSmall, bottomEnd = Dimen.extraSmall))
                .background(ColorPrimary)
                .padding(vertical = Dimen.small, horizontal = Dimen.small)
                .constrainAs(discount) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )
    }
}

/*
@Preview(showBackground = true)
@Composable
fun ProductItemPreview() {
    SuperMarketTheme(darkTheme = false) {
        ProductItem(
            product = Product(
                1, "Product name", "", 100000,
                Promotion(1, 3.2f)
            )
        )
    }
}*/
