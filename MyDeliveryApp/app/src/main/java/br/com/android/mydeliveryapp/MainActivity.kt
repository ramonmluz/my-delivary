package br.com.android.mydeliveryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.android.mydeliveryapp.ui.theme.MyDeliveryAppTheme
import br.com.android.mydeliveryapp.ui.theme.Purple200
import br.com.android.mydeliveryapp.ui.theme.Purple500
import br.com.android.mydeliveryapp.ui.theme.Purple700
import br.com.android.mydeliveryapp.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDeliveryAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    ProductItem()
                }
            }
        }
    }
}

@Composable
fun ProductItem() {
    Surface(Modifier.padding(8.dp), shape = RoundedCornerShape(15.dp), elevation = 4.dp) {
        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .heightIn(100.dp)
                    .background(Brush.horizontalGradient(listOf(Purple500, Teal200)))
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image item",
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(Center)
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = "14,99", fontSize = 14.sp, fontWeight = FontWeight(400)
                )
            }
        }
    }
}

@Composable
fun ProductItemChallenge() {
    Surface(Modifier.padding(8.dp), shape = RoundedCornerShape(15.dp), elevation = 4.dp) {
        Row(
            Modifier
                .heightIn(200.dp, 200.dp)
                .width(400.dp)
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .background(Brush.verticalGradient(listOf(Purple700, Purple200)))
                    .fillMaxHeight()
                    .width(100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image item",

                    modifier = Modifier
                        .size(imageSize)
                        .offset(x = imageSize / 2)
                        .clip(CircleShape)
                        .align(Center)
                        .border(
                            BorderStroke(
                                2.dp,
                                Brush.verticalGradient(listOf(Purple700, Purple200))
                            ), CircleShape
                        )
                )
            }
            Spacer(modifier = Modifier.width(imageSize / 2))
            Column(Modifier.padding(32.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 16.sp,
                    maxLines = 6,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyDeliveryAppTheme {
        ProductItem()
    }
}

@Preview(showBackground = true)
@Composable
fun ChallengePreview() {
    MyDeliveryAppTheme {
        ProductItemChallenge()
    }
}

