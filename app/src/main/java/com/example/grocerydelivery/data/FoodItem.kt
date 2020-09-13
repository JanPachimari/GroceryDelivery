package com.example.grocerydelivery.data

data class FoodItem(
    val image: Int,
    val name: String,
    val description: String,
    val price: Double,
    val isNew: Boolean
    )