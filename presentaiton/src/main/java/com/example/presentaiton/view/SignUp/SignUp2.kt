package com.example.presentaiton.view.SignUp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
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
fun SignUp2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 76.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "안녕하세요!\n이메일로 가입해주세요.",
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF000000)
            )
        )

        Spacer(modifier = Modifier.height(21.dp))

        Text(
            text = "이메일을 입력하여 함께 운동을 해보아요!!",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.pretendard_medium)),
                fontWeight = FontWeight.Normal,
                color = Color(0xFF000000)
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "s24023@gsm.hs.kr",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                            fontWeight = FontWeight(500),
                            color = Color(0xFF111111),
                        )
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(1.dp, Color(0xFF902BE9), RoundedCornerShape(8.dp))
                    .background(Color.White),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* 인증번호 받기 클릭 이벤트 */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .border(1.dp, Color(0xFF902BE9), RoundedCornerShape(8.dp)),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color(0xFF999999)
                )
            )
            {
                Text(
                    text = "인증번호 받기",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                        fontWeight = FontWeight(600),
                        color = Color(0xFF902BE9),
                    )
                )
            }
        }
    }
}


@Preview
@Composable
fun PreviewSignUp2() {
    SignUp2()
}