package com.example.tuan3

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PhoneMockupScreen() {
    // Card chính bao bọc toàn bộ giao diện mockup
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(600.dp),
        shape = RoundedCornerShape(32.dp),
        // Sử dụng CardDefaults cho elevation trong Material 3
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        // Sử dụng CardDefaults cho màu sắc trong Material 3
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFE6E9EE))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Phần thanh trạng thái (status bar)
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "9:41", fontSize = 12.sp, color = Color.Black.copy(alpha = 0.6f))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(8.dp)
                            .background(Color.Black.copy(alpha = 0.6f), shape = CircleShape)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Box(
                        modifier = Modifier
                            .width(22.dp)
                            .height(10.dp)
                            .clip(RoundedCornerShape(2.dp))
                            .background(Color.Black.copy(alpha = 0.6f))
                    )
                }
            }

            // Phần nội dung chính
            Spacer(modifier = Modifier.height(40.dp))

            // Box màu xanh biểu tượng
            Box(
                modifier = Modifier
                    .size(140.dp)
                    .background(Color(0xFF4FC3F7), shape = RoundedCornerShape(16.dp))
            )

            Spacer(modifier = Modifier.height(28.dp))

            // Tiêu đề
            Text(
                text = "Jetpack Compose",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F2937)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Đoạn văn mô tả
            Text(
                text = "Jetpack Compose is a modern UI toolkit for\nbuilding native Android apps with a declarative\nprogramming approach.",
                fontSize = 13.sp,
                color = Color(0xFF6B7280),
                textAlign = TextAlign.Center
            )

            // Dãn nở để đẩy button xuống dưới cùng
            Spacer(modifier = Modifier.weight(1f))

            // Nút bấm
            Button(
                onClick = { /* Xử lý sự kiện khi nhấn nút */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 28.dp)
                    .height(52.dp),
                // Sử dụng ButtonDefaults cho màu sắc trong Material 3
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1AA0FF)),
                shape = RoundedCornerShape(28.dp),
                // Sử dụng ButtonDefaults cho elevation trong Material 3
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp)
            ) {
                Text(
                    text = "I'm ready",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

// Hàm Preview để xem trước giao diện trong Android Studio
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    // Đặt trong một Box để căn giữa màn hình preview
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        PhoneMockupScreen()
    }
}
