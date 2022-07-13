package com.example.cliker


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
private const val key_Count = "count"

class MainActivity : AppCompatActivity() {

   private var count = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceState?.let {
            count =  it.getInt(key_Count)
            val Textcount = findViewById<TextView>(R.id.TextCount)
            Textcount.text = count.toString()

        }



    }

    fun onCLick(view: View) {
        val Textcount = findViewById<TextView>(R.id.TextCount)
        count = count + 1
        Textcount.text = count.toString()
        val TextButton = findViewById<TextView>(R.id.addCounter)
        TextButton.text = "Жмяк"

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(key_Count, count)
    }
}
