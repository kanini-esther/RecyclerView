package com.example.myrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.rvNames)
        val lm = LinearLayoutManager(this)
        recyclerView.layoutManager=lm
        recyclerView.hasFixedSize()
        val people= mutableListOf<Students>()
        people.add(Students("Ruth","9/8/2010","Swimming"))

        val hello=NamesRecyclerViewAdapter(people)
        recyclerView.adapter = hello



    }
}