package com.example.canhan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.canhan.ui.theme.CanhanTheme   // <-- ĐÚNG tên theme của project
import com.example.canhan.R                     // <-- Đảm bảo import đúng R của package này

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanhanTheme {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(120.dp)
                .border(3.dp, Color.Red, CircleShape)
        ) {
            Image(
                painter = painterResource(id = R.drawable.anh),
                contentDescription = "Avatar",
                modifier = Modifier.size(100.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Le Van Khoi - CN230523",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.Red
        )


        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Mong muốn và định hướng của bạn là gì\nsau khi học xong môn học là gì?",
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            color = Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    CanhanTheme { ProfileScreen() }
}
