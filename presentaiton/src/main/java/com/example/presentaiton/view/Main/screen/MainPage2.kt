package com.example.presentaiton.view.Main.screen

import androidx.compose.foundation.Image
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
import com.example.presentaiton.R

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.material3.Divider

@Composable
fun MainPage2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 60.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "MONKEY HEALTH",
                color = Color(0xFF9C27B0),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.vector),
                contentDescription = "Settings",
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.height(26.dp))

        Text(
            text = "집에서 편하게\n정확한 자세로!",
            style = TextStyle(
                fontSize = 32.sp,
                lineHeight = 48.sp,
                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                fontWeight = FontWeight.W600,
                color = Color(0xFF111111)
            ),
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth().align(Alignment.Start)
        )

        Spacer(modifier = Modifier.height(26.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEDEDED), shape = RoundedCornerShape(8.dp))
                .padding(vertical = 30.dp, horizontal = 24.dp)
        ) {
            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = "안녕하세요, 모태환 님 ",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                        fontWeight = FontWeight(500),
                        color = Color(0xFF000000),
                    )
                )
                Spacer(modifier = Modifier.height(20.dp))
                Divider(
                    modifier = Modifier.fillMaxWidth(),
                    thickness = 0.5.dp,
                    color = Color(0xFFC4C4C4)
                )
                Spacer(modifier = Modifier.height(20.dp))
                Column(
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "10월 14일",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF9D9D9D),
                        )
                    )
                    Text(
                        text = "17 : 59 : 34",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                            fontWeight = FontWeight(700),
                            color = Color(0xFF9D9D9D),
                        )
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .width(345.dp)
                .height(51.dp)
                .background(color = Color(0xFFF7F7F7), shape = RoundedCornerShape(size = 12.dp)),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 16.dp) // 좌측 여백 설정
            ) {
                Text(
                    text = "월요일",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                        fontWeight = FontWeight.W600,
                        color = Color(0xFF000000),
                        textAlign = TextAlign.Start
                    )
                )

                Spacer(modifier = Modifier.width(12.dp))

                Text(
                    text = "|  어깨 운동",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF7B7B7B),
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))


        Button(
            onClick = { /* TODO: 맨몸운동 하러가기 클릭 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF902BE9))
        ) {
            Text(
                text = "맨몸운동 하러가기",
                color = Color.White,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Preview
@Composable
fun PreviewMainPage2() {
    MainPage2()
}