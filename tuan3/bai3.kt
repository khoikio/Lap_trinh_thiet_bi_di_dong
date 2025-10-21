package com.example.tuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.foundation.layout.Box

@Composable
fun Bai3(){
    Column (
        modifier = Modifier
            .fillMaxSize()
    )
    {
        header(
            title = "Text Detail",
            modifier = Modifier.padding(top = 35.dp)
        )

        Box(
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Chu()
        }

    }


}
@Preview(showBackground = true)
@Composable
fun Bai3Preview(){
    Bai3()
}
@Composable
fun header(title: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,// can cac phan tu theo chieu doc
        horizontalArrangement = Arrangement.SpaceBetween // day hai phan tu ra 2 dau

    ){
        //Nut back
        IconButton(onClick = { /*TODO: phan xu li khi nhan nut*/ }) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowBack, // icon mui ten back
                contentDescription = "Back",
                tint = Color(0xFF00BFFF)
            )
        }
            // phan tieu de
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF00BFFF)

            )
            // khoang trong de can giua tieu de dung iconbutton trong de chiem khong gian bang nut back
            IconButton(onClick = {}, enabled = false) {}

    }
}
// Noi dung van ban\
@Composable
fun Chu(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        val annotatedString = buildAnnotatedString {
            append("The ")
            withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough))
            {
                append("quick ")
            }
            withStyle(
                style = SpanStyle(
                    color = Color(0xFFC0763C),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold
                )
            ) {
                append("B")
            }
            withStyle(style = SpanStyle(color = Color(0xFFC0763C))) {
                append("rown\n")
            }

            append(" fox j u m p s ")

            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                append("over\n")
            }

            append(" the ")

            withStyle(
                style = SpanStyle(
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline
                )
            ) {
                append("lazy")
            }

            append(" dog.")
        }
        Text(
            text = annotatedString,
            fontSize = 30.sp,
            lineHeight = 36.sp,
            modifier = Modifier.padding(top = 24.dp)
        )
        // Tạo một khoảng trống giữa chữ và đường kẻ
        Spacer(modifier = Modifier.height(16.dp))

        // Đây chính là thẻ <hr> của Compose
        HorizontalDivider(
            thickness = 1.dp, // Độ dày của đường kẻ
            color = Color.Gray // Màu của đường kẻ
        )
    }
}