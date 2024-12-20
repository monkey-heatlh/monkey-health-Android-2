package com.example.presentaiton.view.Main

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentaiton.R

@Composable
fun Mainsub_detail1(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 32.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrow_down),
                    contentDescription = "뒤로가기 이미지",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.height(14.dp))

                Text(
                    text = "뒤로",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_regular)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFF000000),
                    )
                )
            }
            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "PUSH UP",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "운동시 대흉근, 삼두근, 전면/측면삼각근\n복근, 전거근, 광배근 등의 근육군이 쓰인다.",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_regular)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),
                )
            )
            Spacer(modifier = Modifier.height(20.dp))

            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.rectangle_8),
                    contentDescription = "image description",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(345.dp)
                        .height(372.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(44.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { /* 다른 운동 */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF6200EE),
                ),
                border = BorderStroke(1.dp, Color(0xFF6200EE))
            ) {
                Text(text = "다른 운동", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = { /* 바로 시작 */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6200EE),
                    contentColor = Color.White
                )
            ) {
                Text(text = "바로 시작", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview
@Composable
fun PreviewMainsub_detail() {
    Mainsub_detail1()
}