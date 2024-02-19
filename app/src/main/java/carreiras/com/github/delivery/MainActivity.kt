package carreiras.com.github.delivery

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
