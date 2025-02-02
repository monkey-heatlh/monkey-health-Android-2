package com.example.presentation.view.Login.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
internal fun LoginRoute(
    onSignUpClick: () -> Unit,
    onInputLoginClick: () -> Unit
) {
    Login(
        onSignUpClick = onSignUpClick,
        onInputLoginClick = onInputLoginClick
    )
}

@Composable
fun Login(
    modifier: Modifier = Modifier,
    onSignUpClick: () -> Unit,
    onInputLoginClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "MONKEY HEALTH",
            style = TextStyle(
                fontSize = 32.sp,
                fontFamily = FontFamily(Font(R.font.pretendard_semibold)), // 수정: 불필요한 "-" 제거
                fontWeight = FontWeight.Bold,
                color = Color(0xFF902BE9),
            ),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.weight(1f))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onSignUpClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(size = 12.dp),
                modifier = Modifier
                    .width(345.dp)
                    .padding(vertical = 8.dp)
                    .border(2.dp, Color(0xFF902BE9), RoundedCornerShape(size = 12.dp))
            ) {
                Text(
                    text = "회원가입",
                    style = TextStyle(
                        color = Color(0xFF902BE9),
                        fontSize = 16.sp
                    )
                )
            }

            Button(
                onClick = onInputLoginClick,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF902BE9)
                ),
                shape = RoundedCornerShape(size = 12.dp),
                modifier = Modifier
                    .width(345.dp)
                    .padding(vertical = 8.dp)
            ) {
                Text(
                    text = "로그인",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 16.sp
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewLogin() {
    Login(
        onSignUpClick = { println("회원가입 클릭") },
        onInputLoginClick = { println("로그인 클릭") }
    )
}
