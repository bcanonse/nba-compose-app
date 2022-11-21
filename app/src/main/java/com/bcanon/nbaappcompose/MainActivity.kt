package com.bcanon.nbaappcompose

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bcanon.nbaappcompose.ui.theme.NbaAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NbaAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", style = MaterialTheme.typography.body1)
}

@Preview(name = "light_mode", showSystemUi = true, showBackground = true)
@Preview(name = "dark_mode", showSystemUi = true, uiMode = UI_MODE_NIGHT_YES, showBackground = true)
@Composable
fun DefaultPreview() {
    NbaAppComposeTheme {
        Greeting("Android")
    }
}