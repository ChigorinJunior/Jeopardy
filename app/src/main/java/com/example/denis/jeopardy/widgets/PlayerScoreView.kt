package com.example.denis.jeopardy.widgets

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.View
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.domain.Player

class PlayerScoreView(context: Context?) : ConstraintLayout(context) {
    val player: Player? = null

    init {
        View.inflate(context, R.layout.round_layout, null)
    }

    fun setPlayer(player: Player) {

    }
}
