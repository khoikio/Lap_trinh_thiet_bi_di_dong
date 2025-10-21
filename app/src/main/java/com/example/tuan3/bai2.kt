package com.example.tuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
// Xóa "import androidx.compose.material3.ListItem" đi, vì mình tự tạo ListItem riêng
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun Bai2(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF2F4F8)) // Nền xám cho cả màn hình
    ){
        Header(
            modifier = Modifier.padding(top = 35.dp)
        )
        Tieude(text = "Display")
        MyListItem(title = "Text", subtitle = "Displays text")
        MyListItem(title = "Image", subtitle = "Displays an image")
        Tieude(text = "Input")
        MyListItem(title = "TextField", subtitle = "Input field for text")
        MyListItem(title = "PasswordField", subtitle = "Input field for password")
        Tieude(text = "layout")
        MyListItem(title = "Column", subtitle = "Arranges elements vertically")
        MyListItem(title = "Row", subtitle = "Arranges elements horizontally")
        BoxRed(title = "Tự tìm hiểu", subtitle = "tìm ra tất cả các thành phàn UI cơ bản")




    }
}

@Preview(showBackground = true)
@Composable
fun Bai2Preview(){
    Bai2()
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Box (
        modifier = modifier
            .fillMaxWidth()
           // .background(Color(0xFF87CEFA   )) // Nền xanh nhạt cho header
            .padding(vertical = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "UI Components List", // Sửa lại chính tả "Comonents" -> "Components"
            color = Color(0xFF87CEFA),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

// Đổi tên hàm thành MyListItem để tránh nhầm lẫn với hàm có sẵn
@Composable
fun MyListItem(title: String, subtitle: String, modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)// tao khoan cach xung quanh vien
            .background(Color(0xFF87CEFA), shape = RoundedCornerShape(8.dp)) // tạo góc bo tròn
            .padding(16.dp) // tao khoan cach ben trong vien
    ){
        Column {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 16.sp
            )
            Text(
                text = subtitle,
                color = Color.Black,
                fontSize = 14.sp
            )
        }
    }
}
@Composable
fun Tieude(text: String)  {
    Text(
        text= text,
        modifier = Modifier.padding(start = 16.dp, top = 35.dp),
        fontWeight = FontWeight.Bold,
        color = Color.Black
    )
}
@Composable
fun BoxRed (title: String, subtitle: String, modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .background(Color(0xFFFF7F50), shape = RoundedCornerShape(8.dp))
            .padding (16.dp)
    ){
        Column {
            Text (
                text = title,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 16.sp
            )
            Text(
                text = subtitle,
                color = Color.Black,
                fontSize = 14.sp
            )
        }
    }
}