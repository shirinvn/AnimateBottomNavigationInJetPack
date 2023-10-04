package com.example.animatebottomnavigationinjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animatebottomnavigationinjetpack.ui.theme.AnimateBottomNavigationInJetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimateBottomNavigationInJetPackTheme {

               // MainScreen()
            }
        }
    }
}

/*

@Composable
fun MainScreen(){

    Box(
        Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp),
    contentAlignment= Alignment.BottomCenter){

        CustomBtnNavigation()
    }
}
*/
/*

@Composable
fun CustomBtnNavigation() {

    Row(horizontalArrangement = Arrangement.SpaceBetween,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
        .height(80.dp)
        .paint(
            painter = painterResource(id = R.drawable.btn_nav),
            contentScale = ContentScale.FillHeight
        )){

    }
}

@Preview(showBackground = true)
@Composable

fun GreetingPreview() {

    MainScreen()

}*/
