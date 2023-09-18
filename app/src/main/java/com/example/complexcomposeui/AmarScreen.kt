package com.example.complexcomposeui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview
@Composable
fun AmarScreen(){
    ConstraintLayout(
        Modifier
            .fillMaxSize()
            .background(Color.Yellow)) {

        val (fieldRow, fieldLazy) = createRefs()

        Row(Modifier.constrainAs(fieldRow){
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        }) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "H")
            }

            Button(onClick = { /*TODO*/ }) {
                Text(text = "S")
            }
        }

        LazyRow(Modifier.constrainAs(fieldLazy){
            top.linkTo(fieldRow.bottom)
            bottom.linkTo(parent.bottom)
        }) {
            items(getImages()) { musicImage ->

                Spacer(modifier = Modifier.width(30.dp))

                Box(modifier = Modifier.padding(8.dp)) {

                    ConstraintLayout(Modifier.wrapContentSize()) {

                        val (buttonOne, buttonTwo, image) = createRefs()

                        Card(modifier = Modifier
                            .padding(8.dp)
                            .constrainAs(image) {
                                top.linkTo(parent.top)
                                bottom.linkTo(parent.bottom)
                            },
                            elevation = CardDefaults.cardElevation(10.dp),
                            colors = CardDefaults.cardColors(containerColor = White)) {
                            Image(
                                painter = painterResource(id = musicImage.image),
                                contentDescription = "image",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .width(230.dp)
                                    .height(150.dp)
                            )
                        }

                        Button(onClick = { /*TODO*/ }, modifier = Modifier
                            .constrainAs(buttonOne) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                            }
                            .offset((-20).dp, (-20).dp)) {
                            Text(text = "P")
                        }

                        Button(onClick = { /*TODO*/ }, modifier = Modifier
                            .constrainAs(buttonTwo) {
                                top.linkTo(parent.top)
                                end.linkTo(parent.end)
                            }
                            .offset(20.dp, (-20).dp)
                        ) {
                            Text(text = "D")
                        }
                    }
                }
                Spacer(modifier = Modifier.width(30.dp))
            }
        }
    }
}

data class MusicImages(@DrawableRes val image: Int)

fun getImages() = listOf(
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background),
    MusicImages(R.drawable.ic_launcher_background)
)