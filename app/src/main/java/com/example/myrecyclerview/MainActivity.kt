package com.example.myrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import layout.NamesRecyclerViewAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        RecyclerView_Main.setBackgroundColor(Color.CYAN)
        rvNames.LayoutManager = LinearLayoutManager(baseContext)

        val namesAdapter = NamesRecyclerViewAdapter(listOf("Berril","Faith","Duncan","Caro","Marian","Nancy","Eunice","Monica","Martha","Moses",))

        rvNames.adapter = namesAdapter

    }
}