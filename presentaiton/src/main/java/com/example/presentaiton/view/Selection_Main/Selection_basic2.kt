package com.example.presentation.Selection_Main.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentaiton.R

@Composable
fun Selcection_basic2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 66.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrow_down),
                contentDescription = "뒤로가기",
                modifier = Modifier
                    .size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "뒤로",
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.height(34.dp))

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            color = Color(0xFFF1F1F1),
            shape = RoundedCornerShape(12.dp),
            shadowElevation = 4.dp
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "프로필 이미지",
                    modifier = Modifier
                        .size(80.dp)
                        .background(Color.LightGray, CircleShape),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "모태환",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    )
                    Text(
                        text = "s24023@gsm.hs.kr",
                        style = TextStyle(
                            fontSize = 14.sp,
                            color = Color.Gray
                        )
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .size(160.dp)
                    .background(Color(0xFFF1F1F1), RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.ph_calendar),
                        contentDescription = "캘린더",
                        tint = Color.Black,
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        text = "캘린더",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                        )
                    )
                }
            }

            Box(
                modifier = Modifier
                    .size(160.dp)
                    .background(Color(0xFFF1F1F1), RoundedCornerShape(12.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(id = R.drawable.tabler_square_root),
                        contentDescription = "루틴",
                        tint = Color.Black,
                        modifier = Modifier.size(40.dp)
                    )
                    Text(
                        text = "루틴",
                        style = TextStyle(
                            fontSize = 22.sp,
                            fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF000000),
                            textAlign = TextAlign.Center,
                        )
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(36.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(
                    text = "알람 설정",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "알람을 설정해 규칙적인 운동이 가능해요",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Switch(checked = false, onCheckedChange = {})
        }
        Spacer(modifier = Modifier.height(24.dp))
        Column (
            modifier = Modifier
                .border(width = 1.dp, color = Color(0xFFC4C4C4))
                .padding(1.dp)
                .width(345.dp)
                .height(0.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.vector2),
                contentDescription = "image description",
                contentScale = ContentScale.None
            )
        }
        Spacer(modifier = Modifier.height(48.dp))

        Button(
            onClick = { /* 로그아웃 버튼 클릭 이벤트 */ },
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFF902BE9),
                    shape = RoundedCornerShape(size = 12.dp)
                )
                .width(345.dp)
                .height(51.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_outline_log_out),
                    contentDescription = "로그아웃",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "로그아웃",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF902BE9),
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(9.dp))

        Box(
            modifier = Modifier
                .width(345.dp)
                .height(51.dp)
                .background(color = Color(0xFF902BE9), shape = RoundedCornerShape(size = 12.dp))
                .padding(start = 24.dp, top = 16.dp, end = 24.dp, bottom = 16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.mdi_information_outline),
                    contentDescription = "Monkey Health",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Monkey Health 정보",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}

@Preview
@Composable
fun PreviewSelection_basic2() {
    Selcection_basic2()
}