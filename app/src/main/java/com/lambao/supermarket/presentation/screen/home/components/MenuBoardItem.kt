package com.lambao.supermarket.presentation.screen.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.lambao.supermarket.domain.model.MenuBoard
import com.lambao.supermarket.presentation.ui.theme.Dimen

@Composable
fun MenuBoardItem(
    modifier: Modifier = Modifier,
    menuBoard: MenuBoard
) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = modifier
            .aspectRatio(1f)
            .padding(horizontal = Dimen.small)
            .padding(top = Dimen.extraSmall)
        ,
    ) {
        Image(painter = painterResource(id = menuBoard.logo), contentDescription = null)
        Text(
            text = menuBoard.title,
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )
    }
}