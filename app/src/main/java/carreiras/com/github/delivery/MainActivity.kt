package carreiras.com.github.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstComposable()
        }
    }
}

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")
}

@Preview(
    name = "TextPreview",
    heightDp = 200,
    widthDp = 300,
    showBackground = true,
    backgroundColor = 0xFFFF1144
)
@Composable
fun MyFirstComposablePreview() {
    MyFirstComposable()
}
