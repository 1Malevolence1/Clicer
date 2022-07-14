package com.example.cliker

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun onClickResultsTable(viev : View){
        // Исправил здесь на финиш вместо ещё одного startActivity
        // Таким образом нельзя будет вернуться на экран с результатами по кнопке назад в Android
        finish()
    }
}