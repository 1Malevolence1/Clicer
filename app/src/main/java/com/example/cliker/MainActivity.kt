package com.example.cliker

import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val key_count = "count"

class MainActivity : AppCompatActivity() {
    private var count = 0
    private lateinit var storage: ScoreStorage


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        storage = ScoreStorage.Base(
            this.getSharedPreferences(
                key_count,
                Context.MODE_PRIVATE
            )
        )
        count = storage.score()
        if (count != 0) {
            findViewById<TextView>(R.id.TextCount).text = count.toString()

        }
    }

    fun onCLick(view: View) {
        count += 1
        storage.saveScore(count)
        findViewById<TextView>(R.id.TextCount).text = count.toString()
        MediaPlayer.create(this, SoundsButton.CLICK_BUTTON).start()

    }

    fun resetButton(view: View) {
        count = 0
        storage.saveScore(count)
        findViewById<TextView>(R.id.TextCount).text = count.toString()
        MediaPlayer.create(this, SoundsButton.RESET_BUTTON).start()
    }

    fun onClickResultsTable(viev: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}