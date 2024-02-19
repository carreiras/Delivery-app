package carreiras.com.github.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import carreiras.com.github.delivery.ui.theme.DeliveryappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeliveryappTheme {
                Surface {
                    CustomLayoutPreview()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun rowPreview() {
    Row {
        Text("Texto 1")
        Text("Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text("Texto 1")
        Text("Texto 2")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        Modifier
            .padding(8.dp)
            .background(color = Color.Blue)
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text("Texto 1")
        Text("Texto 2")
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 16.dp)
                .background(Color.Green)
                .fillMaxWidth(0.9f)
        ) {
            Text("Texto 3")
            Text("Texto 4")
        }
        Box(
            Modifier
                .padding(8.dp)
                .background(color = Color.Red)
                .padding(all = 8.dp)
        ) {
            Row(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Cyan)
                    .padding(all = 8.dp)
                    .fillMaxWidth()
            ) {
                Text("Texto 5")
                Text("Texto 6")
            }
            Column(
                Modifier
                    .padding(8.dp)
                    .background(color = Color.Yellow)
                    .padding(all = 8.dp)
            ) {
                Text("Texto 7")
                Text("Texto 8")
            }

        }
    }

}

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

@Preview()
@Composable
fun MyFirstComposablePreview() {
    DeliveryappTheme {
        Surface {
            MyFirstComposable()
        }
    }
}
