package com.example.presentaiton.view.Login.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
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
import com.example.presentaiton.component.GomsTextField

@Composable
fun Login1(
    modifier: Modifier = Modifier,
    onInputLoginClick: () -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isEmailError by remember { mutableStateOf(false) }
    var isPasswordError by remember { mutableStateOf(false) }

    // 이메일 검증 로직
    fun validateEmail(): Boolean {
        isEmailError = email.isBlank() || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
        return !isEmailError
    }

    // 비밀번호 검증 로직
    fun validatePassword(): Boolean {
        isPasswordError = password.isBlank() || password.length < 6
        return !isPasswordError
    }

    // 로그인 버튼 클릭 시 검증 후 이동
    fun onLoginClick() {
        val isEmailValid = validateEmail()
        val isPasswordValid = validatePassword()

        if (isEmailValid && isPasswordValid) {
            onInputLoginClick()
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp, vertical = 82.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top
    ) {
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

        // 이메일 라벨 및 입력란
        Column(modifier = Modifier.width(345.dp)) {
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
        GomsTextField(
            textState = email,
            isError = isEmailError,
            placeHolder = "이메일을 입력해주세요",
            onValueChange = { email = it }
        )

        Spacer(modifier = Modifier.height(28.dp))

        // 비밀번호 라벨 및 입력란
        Column(modifier = Modifier.width(345.dp)) {
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
        GomsTextField(
            textState = password,
            isError = isPasswordError,
            placeHolder = "비밀번호를 입력해주세요",
            onValueChange = { password = it }
        )

        Spacer(modifier = Modifier.height(70.dp))

        // 로그인 버튼
        Button(
            onClick = { onLoginClick() },
            modifier = Modifier
                .width(345.dp)
                .height(54.dp),
            shape = RoundedCornerShape(size = 8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF690ED4))
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
fun PreviewLogin1() {
    Login1(onInputLoginClick = {})
}
