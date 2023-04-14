package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myFirstButton)
        val txtClickMe = findViewById<TextView>(R.id.textView)
        var timesClick = 0
        btnClickMe.setOnClickListener{
           timesClick = timesClick+1
            txtClickMe.text = timesClick.toString()

            Toast.makeText(this,"Hey Shameer",Toast.LENGTH_SHORT).show()
        }


    }
}