package com.pisiitech.glidekullanimi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.pisiitech.glidekullanimi.ui.theme.GlideKullanimiTheme
import com.skydoves.landscapist.glide.GlideImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlideKullanimiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
    fun Sayfa() {

    val resimAdi = remember { mutableStateOf("rsm1.png") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(imageModel = "https://techload.net/test/resimler/${resimAdi.value}",
            modifier = Modifier.size(350.dp,300.dp))
        
        Button(onClick = { resimAdi.value = "rsm1.png" }) {
            Text(text = "Resim 1")
        }
        Button(onClick = { resimAdi.value = "rsm2.png" }) {
            Text(text = "Resim 2")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GlideKullanimiTheme {
        Sayfa()
    }
}