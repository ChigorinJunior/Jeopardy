package com.example.denis.jeopardy.ui.round

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.domain.Round

class RoundActivity : AppCompatActivity() {
    companion object {
        private const val ROUND_KEY = "round_key"

        fun createIntent(context: Context, round: Round): Intent {
            return Intent(context, RoundActivity::class.java).apply { putExtra(ROUND_KEY, round) }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.round_layout)
    }
}