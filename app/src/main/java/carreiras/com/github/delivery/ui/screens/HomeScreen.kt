package carreiras.com.github.delivery.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import carreiras.com.github.delivery.model.Product
import carreiras.com.github.delivery.sampledata.sampleSections
import carreiras.com.github.delivery.ui.components.ProductsSection
import carreiras.com.github.delivery.ui.theme.DeliveryappTheme

@Composable
fun HomeScreen(
    sections: Map<String, List<Product>>
) {
    Column {
        OutlinedTextField(value = "Ewerton", onValueChange = { newValue ->
            Log.i("HomeScreen", "HomeScreen: TextField $newValue")
        })
        LazyColumn(
            Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {

            for (section in sections) {
                val title = section.key
                val products = section.value
                item {
                    ProductsSection(
                        title = title,
                        products = products
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    DeliveryappTheme {
        Surface {
            HomeScreen(sampleSections)
        }
    }
}