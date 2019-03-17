package com.example.androidkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter(val  userList : ArrayList<AllData>) : RecyclerView.Adapter<MyAdapter.ViewHolder>()  {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

        val  v = LayoutInflater.from(p0.context).inflate(R.layout.view,p0,false);
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {

        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bindAll(userList[position])

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindAll(allData : AllData)
        {
            val textViewName = itemView.findViewById(R.id.textViewUsername) as TextView
            val textViewAddress  = itemView.findViewById(R.id.textViewAddress) as TextView
            textViewName.text = allData.name
            textViewAddress.text = allData.address
        }

    }
}