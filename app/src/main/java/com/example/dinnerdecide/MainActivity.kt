package com.example.dinnerdecide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private val foodList = arrayListOf<String>("Chinese", "Hamburger", "Pizza", "McDonalds", "Pizza Hut")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener {
            Log.d(TAG, "btnDecide clicked")
            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            tvDisplayFood.text = foodList[randomFood]
        }

        btnAddFood.setOnClickListener {
            val newFood = etAddFood.text.toString()
            foodList.add(newFood)
            etAddFood.text.clear()
            etAddFood.clearFocus()
        }
    }
}
