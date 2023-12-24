package com.example.belajarcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.belajarcompose.ui.theme.BelajarComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.Red)
                        .fillMaxWidth() // Untuk mengisi lebar penuh
                        .height(200.dp), // Untuk mengatur tinggi
                    horizontalAlignment = Alignment.CenterHorizontally, // Untuk mengatur posisi horizontal
                    verticalArrangement = Arrangement.Center // Untuk mengatur posisi vertikal
                ) {// Column disusun secara vertikal (atas ke bawah)
                    Text(text = "Ini dibuat dengan column")
                    Text(
                        text = "Jetpack Compose",
                        //modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }
                Spacer(modifier = Modifier.padding(16.dp)) // Untuk membuat spasi antar komponen
                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = Color.Blue)
                        .fillMaxWidth() // Untuk mengisi lebar penuh
                        .height(200.dp), // Untuk mengatur tinggi
                    horizontalArrangement = Arrangement.Center // Untuk mengatur posisi horizontal
                ) {// Row disusun secara horizontal (kiri ke kanan)
                    Text(
                        text = "Ini dibuat dengan row",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Text(
                        text = "Jetpack Compose",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}

/*
* Catatan :
* 1. Kalau horizontalAlignment dari alignment sendiri yang hanya bisa rata kiri, kanan, atau tengah (lebih terbatas), sedangkan alau horizontalArrangement dari arrangement sendiri yang bisa rata kiri, kanan, tengah, atau spasi diantara (lebih fleksibel)
* */