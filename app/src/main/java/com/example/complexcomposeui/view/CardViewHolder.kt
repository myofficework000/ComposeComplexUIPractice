package com.example.complexcomposeui.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.complexcomposeui.R




@Preview(showBackground = true)
@Composable
fun CardViewHolderDemo(){
    CardViewHolder()
}

@Composable
fun CardViewHolder() {
    Box(modifier = Modifier
        .width(300.dp)
        .height(200.dp)
        .padding(20.dp).background(Color.Gray, shape =RoundedCornerShape(8.dp) )
        ,
       /* border = BorderStroke(1.dp, Color.Gray),
        shape = RoundedCornerShape(8.dp),*/
    ){
        Box(modifier = Modifier.fillMaxSize()){
            Image(
                painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                contentScale = ContentScale.FillBounds, // or some other scale
                modifier = Modifier.matchParentSize()
            )
            FreeButton(Modifier.align(Alignment.TopStart).offset((-20).dp,-20.dp))
            DownloadButton(modifier = Modifier.align(Alignment.TopEnd).offset((20).dp,-20.dp))
        }
    }
}