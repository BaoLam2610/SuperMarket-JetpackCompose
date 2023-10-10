package com.lambao.supermarket.presentation.screen.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import com.lambao.supermarket.domain.model.MenuBoard
import com.lambao.supermarket.presentation.ui.extension.circleLayout
import com.lambao.supermarket.presentation.ui.theme.ColorCritical
import com.lambao.supermarket.presentation.ui.theme.Dimen
import com.lambao.supermarket.presentation.ui.theme.Elevation

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MenuBoardItem(
    modifier: Modifier = Modifier,
    menuBoard: MenuBoard
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier,
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = Elevation.medium),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {
        Box(
            modifier = Modifier
                .padding(top = Dimen.normal)
                .fillMaxSize(0.6f)
                .background(ColorCritical, CircleShape)
                .circleLayout()
                .align(Alignment.CenterHorizontally)
        ) {
            Image(
                painter = painterResource(id = menuBoard.logo),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .fillMaxSize(0.7f)
                    .align(Alignment.Center)
            )
        }

        Text(
            text = stringResource(id = menuBoard.title),
            style = MaterialTheme.typography.labelLarge,
            textAlign = TextAlign.Center,
            maxLines = 1,
            modifier = Modifier
                .padding(top = Dimen.extraSmall)
                .padding(horizontal = Dimen.normal)
                .align(Alignment.CenterHorizontally)
                .basicMarquee(iterations = Int.MAX_VALUE)
        )
    }
}