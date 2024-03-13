package com.example.basiclayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.basiclayouts.ui.theme.BasicLayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android", "Lintang", "5025201045", "PPb-I")
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, name: String, nrp: String, kelas: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        alignment = Alignment.Center
    ) {
        Text(
            fontFamily = FontFamily.SansSerif,
            fontSize = 16.sp,
            color = Color.Red,
            text = "Hello $title!",
        )
        Text(
            fontFamily = FontFamily.Serif,
            fontSize = 14.sp,
            color = Color.Cyan,
            text = "Name: $name"
        )
        Text(
            fontFamily = FontFamily.Serif,
            fontSize = 14.sp,
            color = Color.Cyan,
            text = "NRP: $nrp"
        )
        Text(
            fontFamily = FontFamily.Serif,
            fontSize = 14.sp,
            color = Color.Cyan,
            text = "Kelas: $kelas"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicLayoutsTheme {
        Greeting("Android", "Lintang", "5025201045", "PPB-I")
    }
}