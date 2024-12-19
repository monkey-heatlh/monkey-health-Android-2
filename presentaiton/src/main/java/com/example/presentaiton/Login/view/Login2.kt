package com.example.presentaiton.Login.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentaiton.R

@Composable
fun Login2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 82.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ){
        Text(
            text = "로그인",
            style = TextStyle(
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                fontWeight = FontWeight(600),
                color = Color(0xFF000000),
            )
        )
        Spacer(modifier = Modifier.height(51.dp))

        Column(
            modifier = Modifier
                .width(345.dp)
                .height(17.dp)
        ) {
            Text(
                text = "이메일",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF111111),
                )
            )
        }
        Column (
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF902BE9),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .width(345.dp)
                .height(51.dp)
                .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp)
        ) {
            Text(
                text = "s24023@gsm.hs.kr",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                    fontWeight = FontWeight(500),
                    color = Color(0xFF111111),
                )
            )
        }
        Spacer(modifier = Modifier.height(28.dp))
        Column(
            modifier = Modifier
                .width(345.dp)
                .height(17.dp)
        ){
            Text(
                text = "비밀번호",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF111111),
                )
            )
        }
        Column(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF902BE9),
                    shape = RoundedCornerShape(size = 8.dp)
                )
                .width(345.dp)
                .height(51.dp)
                .padding(start = 20.dp, top = 16.dp, end = 20.dp, bottom = 16.dp)
        ){
            Text(
                text = "●●●●●●●",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 22.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF111111),
                )
            )
        }
        Spacer(modifier = Modifier.height(70.dp))
        Button(
            onClick = { /*확인 클릭 이벤트*/ },
            modifier = Modifier
                .width(345.dp)
                .height(54.dp),
            shape = RoundedCornerShape(size = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF902BE9))
        ) {
            Text(
                text = "로그인",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFFC5C5C5),
                )
            )
        }
    }
}

@Preview
@Composable
fun PreviewLogin2() {
    Login2()
}