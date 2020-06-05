package br.com.siecola.androidproject03.product

// Uma classe do tipo data em Kotlin possui tudo o que é
// necessário para representar um modelo de dados.
data class Product(
    var productID: String,
    var name: String,
    var model: String,
    var code: Int,
    var price: Float
)
