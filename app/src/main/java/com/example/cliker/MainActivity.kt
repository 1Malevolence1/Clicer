package com.example.cliker

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val key_count = "count"

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var storage : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        storage = this.getSharedPreferences(
            key_count,
            Context.MODE_PRIVATE
        )
        count = score()
        if (count != 0) {
            findViewById<TextView>(R.id.TextCount).text = count.toString()
        }
    }

    fun onCLick(view: View) {
        count += 1
        saveScore()
        findViewById<TextView>(R.id.TextCount).text = count.toString()
    }

    private fun score() = storage.getInt(key_count, 0)

    private fun saveScore() {
        storage
            .edit()
            .putInt(key_count, count)
            .apply()
    }
}