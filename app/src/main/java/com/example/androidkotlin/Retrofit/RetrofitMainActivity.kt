package com.example.androidkotlin.Retrofit

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ProgressBar
import com.example.androidkotlin.R
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitMainActivity : AppCompatActivity() {

    private var listView: ListView? = null
    private var books: List<MyData>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit_main)

        listView = findViewById(R.id.listViewBooks) as ListView

        getbooks()

        listView!!.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this, ShowBookDetails::class.java)
            val book = books!![i]
            intent.putExtra(KEY_BOOK_ID, book.bookId)
            intent.putExtra(KEY_BOOK_NAME, book.name)
            intent.putExtra(KEY_BOOK_PRICE, book.price)
            intent.putExtra(KEY_BOOK_STOCK, book.inStock)

            //Starting another activity to show book details
            startActivity(intent)
        }

    }

    private fun getbooks() {

        val retrofit = Retrofit.Builder().baseUrl(ROOT_URL).addConverterFactory(GsonConverterFactory.create()).build()

        var request = retrofit.create(MyApi::class.java)
        var call = request.getAllPost()

        call.enqueue(object : Callback<List<MyData>> {
            override fun onResponse(call: Call<List<MyData>>, response: Response<List<MyData>>) {



            }

            override fun onFailure(call: Call<List<MyData>>, t: Throwable) {

            }


        })


    }

    companion object {

        val ROOT_URL = "https://api.myjson.com/"

        val KEY_BOOK_ID = "key_book_id"
        val KEY_BOOK_NAME = "key_book_name"
        val KEY_BOOK_PRICE = "key_book_price"
        val KEY_BOOK_STOCK = "key_book_stock"
    }
}
