package com.example.complexcomposeui.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.complexcomposeui.R
import com.example.complexcomposeui.ui.theme.DownloadButtonBackground
import com.example.complexcomposeui.ui.theme.FreeButtonBackground

@Preview(showBackground = true)
@Composable
fun CustomButton(){

    DownloadButton(Modifier)
    FreeButton(Modifier)
}

@Composable
fun DownloadButton(modifier: Modifier){
    Button(onClick = { /*TODO*/ },
        modifier= modifier.size(50.dp),  //avoid the oval shape
        shape = CircleShape,
        border= BorderStroke(1.dp, Color.Black),
        contentPadding = PaddingValues(0.dp),  //avoid the little icon
        colors = ButtonDefaults.buttonColors(DownloadButtonBackground)
    ) {
        Image(painter = painterResource(id = R.drawable.baseline_download_24),
            contentDescription = "")
    }
}

@Composable
fun FreeButton(modifier: Modifier){
    Button(onClick = { /*TODO*/ },
        modifier= modifier.size(50.dp),  //avoid the oval shape
        shape = CircleShape,
        border= BorderStroke(1.dp, Color.Black),
        contentPadding = PaddingValues(0.dp),  //avoid the little icon
        colors = ButtonDefaults.buttonColors(FreeButtonBackground)
    ) {
       Text(text = "Free",
           fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(5.dp))
    }
}
@Composable
fun HomeButton(modifier: Modifier){
    Button(onClick = { /*TODO*/ },
        modifier= modifier.size(50.dp),  //avoid the oval shape
        shape = CircleShape,
        border= BorderStroke(1.dp, Color.Black),
        contentPadding = PaddingValues(0.dp),  //avoid the little icon
        colors = ButtonDefaults.buttonColors(DownloadButtonBackground)
    ) {
        Image(painter = painterResource(id = R.drawable.baseline_home_24),
            contentDescription = "")
    }
}
@Composable
fun NoAdsButton(modifier: Modifier){
    Button(onClick = { /*TODO*/ },
        modifier= modifier.size(50.dp),  //avoid the oval shape
        shape = CircleShape,
        border= BorderStroke(1.dp, Color.Black),
        contentPadding = PaddingValues(0.dp),  //avoid the little icon
        colors = ButtonDefaults.buttonColors(FreeButtonBackground)
    ) {
        Text(text = "No Ads",
            fontWeight = FontWeight.ExtraBold, modifier = Modifier)

    }
}