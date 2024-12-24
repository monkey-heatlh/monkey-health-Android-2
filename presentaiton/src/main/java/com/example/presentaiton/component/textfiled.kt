package com.example.presentaiton.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.presentaiton.view.Login.screen.Login2

@Composable
fun GomsTextField(
    modifier: Modifier = Modifier,
    isError: Boolean = false,
    isEmail: Boolean = true,
    placeHolder: String = "",
    readOnly: Boolean = false,
    focusManager: FocusManager = LocalFocusManager.current,
    focusRequester: FocusRequester = FocusRequester(),
    textState: String,  // 상태값으로 변경
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    maxLines: Int = Int.MAX_VALUE,
    singleLine: Boolean = false,
    maxLength: Int = if (isEmail) 6 else Int.MAX_VALUE,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    onValueChange: (String) -> Unit = {},
) {
    val isFocused = remember { mutableStateOf(false) }

    // 상태값을 GomsTextField로 관리할 수 있도록 변경
    val text = remember { mutableStateOf(textState) }

    DisposableEffect(Unit) {
        onDispose {
            focusManager.clearFocus()
        }
    }

    Column {
        OutlinedTextField(
            value = text.value,
            onValueChange = {
                val filteredText = it.filterNot { text -> text.isWhitespace() }
                if (filteredText.length <= maxLength) {
                    text.value = filteredText
                    onValueChange(filteredText)
                }
            },
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            placeholder = {
                Text(
                    text = placeHolder,
                    style = typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    color = if (isError) Color.Red else Color.Gray
                )
            },
            modifier = modifier
                .fillMaxWidth()
                .height(64.dp)
                .focusRequester(focusRequester)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.LightGray)  // 색상 수정
                .border(
                    width = 1.dp,
                    color = if (isError) Color.Red else Color.Transparent,
                    shape = RoundedCornerShape(12.dp)
                )
                .onFocusChanged {
                    isFocused.value = it.isFocused
                },
            maxLines = maxLines,
            singleLine = singleLine,
            textStyle = typography.bodyMedium,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = if (isError) Color.Red else Color.Black,
                unfocusedTextColor = if (isError) Color.Red else Color.Black,
                focusedPlaceholderColor = if (isError) Color.Red else Color.Gray,
                unfocusedPlaceholderColor = if (isError) Color.Red else Color.Gray,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                cursorColor = Color.Black
            ),
            readOnly = readOnly,
            visualTransformation = visualTransformation
        )
    }
}

@Composable
fun NumberTextField(
    modifier: Modifier = Modifier,
    setText: String,
    placeHolder: String = "",
    focusManager: FocusManager = LocalFocusManager.current,
    focusRequester: FocusRequester = FocusRequester(),
    isError: Boolean,
    errorText: String = "",
    maxLength: Int = 4,
    onValueChange: (String) -> Unit,
    onResendClick: () -> Unit,
) {
    val context = LocalContext.current
    val isFocused = remember { mutableStateOf(false) }
    val isErrorTextField = remember { mutableStateOf(isError) }
    val errorTextTextField = remember { mutableStateOf(errorText) }

    LaunchedEffect(isError, errorText) {
        isErrorTextField.value = isError
        errorTextTextField.value = errorText
    }

    DisposableEffect(Unit) {
        onDispose {
            focusManager.clearFocus()
        }
    }

    Column {
        OutlinedTextField(
            value = setText,
            onValueChange = {
                val filteredText = it.filterNot { text -> text.isWhitespace() }
                if (filteredText.length <= maxLength) {
                    onValueChange(filteredText)
                }
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
            placeholder = {
                Text(
                    text = placeHolder,
                    style = typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    color = if (isError) Color.Red else Color.Gray
                )
            },
            modifier = modifier
                .fillMaxWidth()
                .height(64.dp)
                .focusRequester(focusRequester)
                .clip(RoundedCornerShape(12.dp))
                .background(Color.LightGray)
                .border(
                    width = 1.dp,
                    color = if (isError) Color.Red else Color.Transparent,
                    shape = RoundedCornerShape(12.dp)
                )
                .onFocusChanged {
                    isFocused.value = it.isFocused
                    if (it.isFocused) {
                        onValueChange("")
                    }
                },
            maxLines = 1,
            singleLine = true,
            textStyle = typography.bodyMedium,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = if (isError) Color.Red else Color.Black,
                unfocusedTextColor = if (isError) Color.Red else Color.Black,
                focusedPlaceholderColor = if (isError) Color.Red else Color.Gray,
                unfocusedPlaceholderColor = if (isError) Color.Red else Color.Gray,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                cursorColor = Color.Black
            )
        )

        // 오류 텍스트가 있다면, 빨간색으로 표시하기
        if (isErrorTextField.value) {
            Text(
                text = errorTextTextField.value,
                color = Color.Red,
                style = typography.bodySmall
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewGomsTextField() {
    GomsTextField(
        textState = "example@domain.com",
        placeHolder = "Enter your email",
        isError = false, // 에러 상태 설정
        onValueChange = { newText -> println("Changed Text: $newText") }
    )
}

@Composable
@Preview(showBackground = true)
fun NumberTextField() {
    GomsTextField(
        textState = "example@domain.com",
        placeHolder = "Enter your email",
        isError = true, // 에러 상태 설정
        onValueChange = { newText -> println("Changed Text: $newText") }
    )
}