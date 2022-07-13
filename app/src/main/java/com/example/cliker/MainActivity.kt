package com.example.cliker

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun onCLick(view: View){
        val Textcount = findViewById<TextView>(R.id.TextCount)
        count = count + 1
        Textcount.text = count.toString()
        val TextButton = findViewById<TextView>(R.id.addCounter)
        TextButton.text = "Жмяк"

        }
}