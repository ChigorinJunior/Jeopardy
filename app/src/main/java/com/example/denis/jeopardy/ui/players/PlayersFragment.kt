package com.example.denis.jeopardy.ui.players

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.db.GameDB
import com.example.denis.jeopardy.domain.Game
import com.example.denis.jeopardy.domain.Player
import com.example.denis.jeopardy.repository.PlayersRepository
import com.example.denis.jeopardy.ui.rounds.RoundsActivity
import kotlinx.android.synthetic.main.players_fragment.*

class PlayersFragment : Fragment() {
    var playersAdapter: PlayersAdapter? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.players_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        fab.setOnClickListener { _ ->
            val selectedPlayers = playersAdapter?.getSelectedPlayers().orEmpty()
            GameDB.game = Game(id = 0, players = selectedPlayers)
            openRoundsActivity()
        }

        PlayersRepository().getPlayers()
                .subscribe({ players -> setUpPlayers(players) },
                        { t -> })
    }

    private fun setUpPlayers(players: List<Player>) {
        playersAdapter = PlayersAdapter(players)
        playersRecycler.layoutManager = LinearLayoutManager(context)
        playersRecycler.adapter = playersAdapter
    }

    private fun openRoundsActivity() {
        context.startActivity(Intent(context, RoundsActivity::class.java))
    }
}