package com.example.presentaiton.Main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentaiton.R

@Composable
fun MainSub2(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 32.dp),
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
        Spacer(modifier = Modifier.height(24.dp))
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            Text(
                text = "무슨 운동을 배워볼까요?\n(눌러서 선택)",
                style = TextStyle(
                    fontSize = 30.sp,
                    lineHeight = 42.sp,
                    fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                    fontWeight = FontWeight(600),
                    color = Color(0xFF111111),
                    textAlign = TextAlign.Center,
                ),
            )
            Spacer(modifier = Modifier.height(41.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Box(
                        Modifier
                            .border(width = 3.5.dp, color = Color(0xFF902BE9), shape = RoundedCornerShape(size = 12.dp))
                            .width(161.dp)
                            .height(116.dp)
                            .background(
                                color = Color(0x99787878),
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "가슴",
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(161.dp)
                            .height(116.dp)
                            .background(
                                color = Color(0x99111111),
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "복근",
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier
                            .width(161.dp)
                            .height(116.dp)
                            .background(
                                color = Color(0x99111111),
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "등",
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                    }

                    Box(
                        modifier = Modifier
                            .width(161.dp)
                            .height(116.dp)
                            .background(
                                color = Color(0x99111111),
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "하체",
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier
                            .width(161.dp)
                            .height(116.dp)
                            .background(
                                color = Color(0x99111111),
                                shape = RoundedCornerShape(12.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "전신",
                            style = TextStyle(
                                fontSize = 22.sp,
                                lineHeight = 22.sp,
                                fontFamily = FontFamily(Font(R.font.pretendard_semibold)),
                                fontWeight = FontWeight(600),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(74.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(color = Color(0xFF690ED4), shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "다음",
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
}
@Preview
@Composable
fun PreviewMainSub2() {
    MainSub2()
}