package com.example.restaran_menyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restaran_menyu.Adapters.UserAdapters
import com.example.restaran_menyu.Data.UserData

class MainActivity : AppCompatActivity() {
    val data =ArrayList<UserData>()
    private lateinit var adapter:UserAdapters
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listImage = listOf<Int>(
            R.drawable.food_1,
            R.drawable.food_1,
            R.drawable.food_1,
            R.drawable.food_1,
            R.drawable.food_1,
            R.drawable.food_1
        )
        val listName = listOf<String>(
            "Kabab",
            "Shashlik",
            "JIz",
            "QozonKabob",
            "Shashlik",
            "QozonKabob"
        )
        (0..listName.size-1).forEach{i->
            data.add(UserData(listImage[i],listName[i]))

        }
        val recyclerView: RecyclerView = findViewById(R.id.RecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = UserAdapters(data)
        recyclerView.adapter = adapter
    }
}