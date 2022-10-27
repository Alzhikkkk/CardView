package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var elements : ArrayList<ListElement>;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    fun init(): Unit{
        elements = ArrayList<ListElement>();
        elements.add(ListElement("#775447", "Harry Potter", "Joanne Rowling", "Favorite"))
        elements.add(ListElement("#607d8b", "Abay Zholy", "Mukhtar Auezov", "Favorite"))
        elements.add(ListElement("#03a9f4", "Rich dad Poor dad", "Robert Kiyosaki", "Not Favorite"))
        elements.add(ListElement("#f44336", "Grokking Algorithms", "Адитья Бхаргава", "Favorite"))
        elements.add(ListElement("#009688", "Flowers for Algernon", "Daniel Keyes", "Not Favorite"))


        val listAdapter = ListAdapter (this, elements)
        val recyclerView = findViewById<RecyclerView>(R.id.listRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.adapter = listAdapter
    }
}