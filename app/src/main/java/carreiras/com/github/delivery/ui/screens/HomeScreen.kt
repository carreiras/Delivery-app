package carreiras.com.github.delivery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import carreiras.com.github.delivery.R
import carreiras.com.github.delivery.model.Product
import carreiras.com.github.delivery.sampledata.sampleProducts
import carreiras.com.github.delivery.ui.components.ProductSection
import java.math.BigDecimal

@Composable
fun HomeScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)

    ) {
        Spacer(Modifier)
        ProductSection("Promoções", sampleProducts)
        ProductSection(
            "Doces", listOf(
                Product(
                    name = "Chocolate",
                    price = BigDecimal("5.99"),
                    image = R.drawable.placeholder
                )
            )
        )
        ProductSection("Bebidas", sampleProducts)
        Spacer(Modifier)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}