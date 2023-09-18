package com.example.complexcomposeui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun ListOfOptionDemo(){

    ListOfOption()
}
@Composable
fun ListOfOption() {
    Column(modifier = Modifier.fillMaxSize().background(Color.Yellow)) {
        Row(modifier = Modifier.fillMaxWidth()) {
            HomeButton(modifier = Modifier.padding(10.dp))
            NoAdsButton(modifier = Modifier.padding(10.dp))
        }
        LazyRow(
            modifier = Modifier.fillMaxSize().padding(vertical = 20.dp)
        ){
            items(getList()){
                    img ->
                CardViewHolder()
            }
        }
    }

}
fun getList() = listOf("foo","bar","foo","bar")