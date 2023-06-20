package br.com.android.mydeliveryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.android.mydeliveryapp.ui.theme.MyDeliveryAppTheme
import br.com.android.mydeliveryapp.ui.theme.Purple500
import br.com.android.mydeliveryapp.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDeliveryAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProductItem()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyDeliveryAppTheme {
        ProductItem()
    }
}

@Composable
fun ProductItem() {
    Column(
        Modifier
            .width(200.dp)
            .height(250.dp)
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(Brush.horizontalGradient(listOf(Purple500, Teal200)))
                .fillMaxWidth()
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "image item",
            modifier = Modifier
                .offset(y=(-50).dp)
                .size(100.dp)
                .clip(CircleShape)
                .align(CenterHorizontally)
        )

        Text(text = "Text 1")
        Text(text = "Text 2")
    }
}

