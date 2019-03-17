package com.example.androidkotlin.Retrofit

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface MyApi {

    @GET("/bins/jul6f")
    fun getAllPost(): Call<List<MyData>>
}
