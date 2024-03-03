package carreiras.com.github.delivery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
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
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(Modifier)
        for (section in sections) {
            val title = section.key
            val products = section.value
            ProductsSection(
                title = title,
                products = products
            )
        }
        Spacer(Modifier)
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