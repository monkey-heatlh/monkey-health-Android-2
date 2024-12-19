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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.presentaiton.R

@Composable
fun MainPage1(
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
            modifier = Modifier.fillMaxWidth()
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
                    text = buildAnnotatedString {
                        append("안녕하세요, ")
                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, color = Color(0xFF000000))) {
                            append("모태환")
                        }
                        append(" 님")
                    },
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Column (
                    modifier = Modifier
                        .border(width = 0.5.dp, color = Color(0xFFC4C4C4))
                        .padding(0.5.dp)
                        .width(321.dp)
                        .height(0.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vector2),
                        contentDescription = "image description",
                    )
                }
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

        Button(
            onClick = { /* TODO: 루틴 설정하기 클릭 */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .border(1.dp, Color(0xFF9C27B0), RoundedCornerShape(8.dp)),
            colors = ButtonDefaults.buttonColors(containerColor = Color.White)
        ) {
            Text(
                text = "루틴 설정하기",
                color = Color(0xFF9C27B0),
                fontWeight = FontWeight.Medium
            )
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
fun PreviewMainPage1() {
    MainPage1()
}