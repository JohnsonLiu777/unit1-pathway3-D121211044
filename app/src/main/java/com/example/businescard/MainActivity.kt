package com.example.businescard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businescard.ui.theme.BusinesCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardText("Johnson Liu", "Mahasiswa Teknik Informatika")
                }
            }
        }
    }
}

@Composable
fun CardText(name: String, job: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(Color(202, 201, 241))
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
        ) {
            val image = painterResource(id = R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = modifier
                    .size(200.dp)
            )
            Text(
                text = name,
                fontSize = 32.sp,
                color = Color(6, 113, 183),
                modifier = Modifier.padding(7.dp),
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = job,
                fontSize = 16.sp,
                color = Color(225, 137, 166),
                fontWeight = FontWeight.ExtraBold
            )
        }
        Contact(modifier = Modifier)
    }
}

@Composable
fun Contact(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(bottom = 20.dp, start = 50.dp)
    ) {
        val iconColor = Color(225, 137, 166)
        val textColor = Color(6, 113, 183)

        Row(modifier = Modifier.padding(7.dp)) {
            Icon(
                Icons.Filled.Call,
                contentDescription = "Localized description",
                tint = iconColor,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "0989393939393",
                fontSize = 18.sp,
                color = textColor
            )
        }
        Row(modifier = Modifier.padding(7.dp)) {
            Icon(
                Icons.Filled.Share,
                contentDescription = "Localized description",
                tint = iconColor,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "JohnsonLiu",
                fontSize = 18.sp,
                color = textColor
            )
        }
        Row(modifier = Modifier.padding(7.dp)) {
            Icon(
                Icons.Filled.Email,
                contentDescription = "Localized description",
                tint = iconColor,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Text(
                text = "Johnsonliu747@gmail.com",
                fontSize = 18.sp,
                color = Color(10, 111, 202)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesCardTheme {
        CardText("Johnson Liu", "Mahasiswa Teknik Informatika")
    }
}
