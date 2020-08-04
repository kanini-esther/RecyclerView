package com.example.myrecyclerview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        RecycleView_Main.setBackgroundColor(Color.CYAN)
        rvNames.LayoutManager = LinearLayoutManager(baseContext)

        val namesAdapter = NamesRecyclerViewAdapter(ListOf("Esther","Mercy","caro","Berril","Faith","Marriam","Natasha","Nikita","shirley",))


    }
}