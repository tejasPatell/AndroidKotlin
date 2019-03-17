package com.example.androidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)

        val users = ArrayList<AllData>()
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Raj","Ahmedabad"))
        users.add(AllData("Mayur","Vadodara"))
        users.add(AllData("VB","SG"))
        users.add(AllData("Joy","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))
        users.add(AllData("Tejas","Surat"))

        val adapter = MyAdapter(users)
        recyclerView.adapter = adapter
    }
}
