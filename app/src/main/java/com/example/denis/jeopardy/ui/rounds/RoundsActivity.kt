package com.example.denis.jeopardy.ui.rounds

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.db.GameDB
import com.example.denis.jeopardy.domain.Round
import com.example.denis.jeopardy.ui.round.RoundActivity
import kotlinx.android.synthetic.main.rounds_activity.*

class RoundsActivity : AppCompatActivity(), RoundsAdapter.RoundClickListener {
    override fun onRoundSelected(round: Round) {
        startActivity(RoundActivity.createIntent(this, round))
    }

    var roundsAdapter: RoundsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rounds_activity)
        setUpAdapter(GameDB.game?.rounds.orEmpty())
    }

    private fun setUpAdapter(rounds: List<Round>) {
        roundsAdapter = RoundsAdapter(rounds, this)
        roundsRecycler.layoutManager = LinearLayoutManager(this)
        roundsRecycler.adapter = roundsAdapter
    }
}