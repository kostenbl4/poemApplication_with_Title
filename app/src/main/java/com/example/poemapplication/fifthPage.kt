package com.example.poemapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class fifthPage : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_page)

        val previousButton = findViewById<Button>(R.id.previousButton)
        val nextButton = findViewById<Button>(R.id.nextButton)

        previousButton.setOnClickListener {
            val previousPageSkip = Intent(this, fourthPage::class.java)
            startActivity(previousPageSkip)
        }

        nextButton.setOnClickListener {
            val nextPageSkip = Intent(this, firstPage::class.java)
            startActivity(nextPageSkip)
        }

    }
}