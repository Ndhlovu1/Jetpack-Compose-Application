package com.example.composeapplication01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            //Add a text composable
            Text(
                    text = "JETPACK COMPOSE APP",
                    fontSize = 32.sp,
                    color = Color.Magenta
            )

        }
    }
}
