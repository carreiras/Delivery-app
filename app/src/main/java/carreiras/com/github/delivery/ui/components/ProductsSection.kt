package carreiras.com.github.delivery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import carreiras.com.github.delivery.model.Product
import carreiras.com.github.delivery.sampledata.sampleProducts
import carreiras.com.github.delivery.ui.theme.DeliveryappTheme

@Composable
fun ProductsSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            text = title,
            Modifier.padding(
                start = 16.dp,
                end = 16.dp
            ),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        LazyRow(
            Modifier
                .padding(
                    top = 8.dp
                )
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
//            for (p in products) {
//                item {
//                    ProductItem(product = p)
//                }
//            }

            items(products) { p ->
                ProductItem(product = p)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductsSectionPreview() {
    DeliveryappTheme {
        Surface {
            ProductsSection(title = "Promoções", products = sampleProducts)
        }
    }
}
