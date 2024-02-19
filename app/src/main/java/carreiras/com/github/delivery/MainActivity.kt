package carreiras.com.github.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import carreiras.com.github.delivery.ui.theme.DeliveryappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeliveryappTheme {
                Surface {
                    MyFirstComposable()
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

@Preview(showBackground = true)
@Composable
fun CustomLayoutPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 2")
        Row {
            Text("Texto 3")
            Text("Texto 4")
        }
        Box {
            Row {
                Text("Texto 5")
                Text("Texto 6")
            }
            Column {
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
