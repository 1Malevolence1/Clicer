package com.example.cliker

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val key_count = "count"

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedInstanceState?.let {
            count = it.getInt(key_count)
            findViewById<TextView>(R.id.TextCount).text = count.toString()
        }
    }

    fun onCLick(view: View) {
        count += 1
        findViewById<TextView>(R.id.TextCount).text = count.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(key_count, count)
    }
}