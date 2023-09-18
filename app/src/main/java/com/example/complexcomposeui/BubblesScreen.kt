package com.example.complexcomposeui

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LazyRowWithAlternatingOffsetButtons() {
    val imageLst = listOf(
        R.drawable.bubble1,
        R.drawable.bubble2,
        R.drawable.bubble3,
        R.drawable.bubble4,
        R.drawable.bubble5,
        R.drawable.bubble6,
        R.drawable.bubble7,
        R.drawable.bubble8,
        R.drawable.bubble9,
        R.drawable.bubble10,
    )
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(50.dp)
    ) {
        itemsIndexed(imageLst) { index, imageResId ->
            ImageButtonItem(imageResource = imageResId, index = index)
        }
    }

}

@Composable
fun ImageButtonItem(imageResource: Int, index: Int) {
    val offset = if (index % 2 == 0) 50.dp else -50.dp
    Box(
        modifier = Modifier
            .size(100.dp)
            .offset(y = offset)
    ) {
        Image(
            painter = painterResource(id = imageResource),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}