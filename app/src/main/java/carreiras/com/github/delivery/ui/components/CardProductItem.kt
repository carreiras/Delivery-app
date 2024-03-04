package carreiras.com.github.delivery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import carreiras.com.github.delivery.R
import carreiras.com.github.delivery.extensions.toBrazilianCurrency
import carreiras.com.github.delivery.model.Product
import carreiras.com.github.delivery.sampledata.sampleProducts
import carreiras.com.github.delivery.ui.theme.DeliveryappTheme
import coil.compose.AsyncImage

@Composable
fun CardProductItem(
    product: Product,
    modifier: Modifier = Modifier,
    elevation: Dp = 4.dp
) {
    Card(
        modifier
            .fillMaxWidth()
            .heightIn(150.dp)
    ) {
        Column {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                placeholder = painterResource(id = R.drawable.placeholder),
                contentScale = ContentScale.Crop
            )
            Column(
                Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.inversePrimary)
                    .padding(16.dp)
            ) {
                Text(
                    text = product.name
                )
                Text(
                    text = product.price.toBrazilianCurrency()
                )
            }
            // TODO: adicionar descrição do produto
            // Text(
            //     text = product.description,
            //     Modifier
            //         .padding(16.dp)
            // )
        }
    }
}



@Preview
@Composable
private fun CardProductItemPreview() {
    DeliveryappTheme {
        Surface {
            CardProductItem(
                product = sampleProducts.random(),
            )
        }
    }
}