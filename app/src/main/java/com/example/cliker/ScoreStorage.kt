package com.example.cliker

import android.content.SharedPreferences

/**
 * Human Developing Soft
 *
 * @author Egor Ponomarev
 */

private const val key_count = "count"

interface ScoreStorage {

    fun score(): Int

    fun saveScore(score: Int)

    class Base(
        private val mSharedPreferences: SharedPreferences
    ) : ScoreStorage {

        override fun score() = mSharedPreferences.getInt(key_count, 0)

        override fun saveScore(score: Int) {
            mSharedPreferences
                .edit()
                .putInt(key_count, score)
                .apply()
        }
    }
}