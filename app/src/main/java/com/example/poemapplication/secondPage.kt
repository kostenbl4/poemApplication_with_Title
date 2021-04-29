package com.example.poemapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondPage : AppCompatActivity() {

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val previousButton = findViewById<Button>(R.id.previousButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        previousButton.setOnClickListener {
            val previousPageSkip = Intent(this, firstPage::class.java)
            startActivity(previousPageSkip)
        }

        nextButton.setOnClickListener {
            val nextPageSkip = Intent(this, thirdPage::class.java)
            startActivity(nextPageSkip)
        }
    }
}