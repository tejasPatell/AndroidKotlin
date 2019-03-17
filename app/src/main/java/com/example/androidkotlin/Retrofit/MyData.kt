package com.example.androidkotlin.Retrofit

import com.google.gson.annotations.SerializedName

data class MyData (    var bookId: Int = 0,
                       var name: String? = null,
                       var price: String? = null,
                       var inStock: Int = 0

)
