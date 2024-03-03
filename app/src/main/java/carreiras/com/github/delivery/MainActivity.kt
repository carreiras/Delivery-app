package carreiras.com.github.delivery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import carreiras.com.github.delivery.sampledata.sampleSections
import carreiras.com.github.delivery.ui.screens.HomeScreen
import carreiras.com.github.delivery.ui.theme.DeliveryappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    DeliveryappTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}
