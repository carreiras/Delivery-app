package carreiras.com.github.delivery.model

import java.math.BigDecimal

class Product(
    val name: String,
    val price: BigDecimal,
    val image: String? = null
)
