package com.example.composeapplication01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.ui.core.Modifier
import com.example.composeapplication01.ui.theme.ComposeApplication01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ComposeApplication01Theme {
                //Surface containter is for the background
                Surface(
                    color = MaterialTheme.colorScheme.background

                ) {

                    RestaurantName(name = stringResource(id = R.string.title), size = 26)

                }


            }


        }
    }
}

//Declare a composable for loading the title
@Composable
fun RestaurantName(name : String, size: Int){
    
    //Call a Text Composable
    Text(
        text = name,
        fontSize = size.sp

    )
}

@Preview(showBackground = true)
@Composable
fun RestaurantPreview(){
    RestaurantName(name = stringResource(id = R.string.title), size = 24)
}

