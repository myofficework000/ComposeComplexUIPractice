package com.example.complexcomposeui

import android.widget.ImageButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.IconButton
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
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Image(painter = painterResource(id =R.drawable.baseline_login_24), contentDescription = null)
            }
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Image(painter = painterResource(id =R.drawable.baseline_stars_24), contentDescription = null)
            }
            Spacer(modifier = Modifier.weight(1f))
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Image(painter = painterResource(id =R.drawable.baseline_build_circle_24), contentDescription = null)
            }
        }
        
        Spacer(modifier = Modifier.size(50.dp))

        LazyRow(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            itemsIndexed(imageLst) { index, imageResId ->
                ImageButtonItem(imageResource = imageResId, index = index)
            }
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
            contentScale = ContentScale.Inside,
            modifier = Modifier.fillMaxSize()
        )
    }
}