package com.example.poemapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val readButton = findViewById<TextView>(R.id.textView2)

        readButton.setOnClickListener {
            val readBook = Intent(this, firstPage::class.java)
            startActivity(readBook)
        }
    }
}