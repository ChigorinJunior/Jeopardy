package com.example.denis.jeopardy.ui.players

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.domain.Player
import com.example.denis.jeopardy.utils.ImageLoader
import kotlinx.android.synthetic.main.players_item.view.*

class PlayersAdapter(val players: List<Player>): RecyclerView.Adapter<PlayersAdapter.PlayersViewHolder>() {
    private val selectedPlayers = HashSet<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.players_item, parent, false)
        return PlayersViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        holder.init(players[position])
    }

    override fun getItemCount(): Int {
        return players.size
    }

    fun getSelectedPlayers(): List<Player> {
        val choosenPlayers = mutableListOf<Player>()

        for (player in players) {
            val id = selectedPlayers.find { it == player.id }

            if (id != null) {
                choosenPlayers.add(player)
            }
        }

        return choosenPlayers
    }

    inner class PlayersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun init(player: Player) {
            ImageLoader().loadImage(player.avatar.url, itemView.avatarImageView)
            itemView.playerName.text = player.firstName + " " + player.lastName
            itemView.playerRating.text = player.rating.value.toString()
            itemView.playerCheckBox.setOnCheckedChangeListener { _, isChecked -> updateUserSelection(isChecked, player)}
        }

        private fun updateUserSelection(isSelected: Boolean, player: Player) {
            if (isSelected) {
                selectedPlayers.add(player.id)
            } else {
                selectedPlayers.remove(player.id)
            }
        }
    }
}