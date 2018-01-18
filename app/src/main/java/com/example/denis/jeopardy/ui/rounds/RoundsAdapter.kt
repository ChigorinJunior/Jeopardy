package com.example.denis.jeopardy.ui.rounds

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.domain.Player
import com.example.denis.jeopardy.domain.Round
import kotlinx.android.synthetic.main.round_item.view.*

class RoundsAdapter(val rounds: List<Round>, val roundClickListener: RoundClickListener):
        RecyclerView.Adapter<RoundsAdapter.RoundsViewHolder>() {

    interface RoundClickListener {
        fun onRoundSelected(round: Round)
    }

    companion object {
        const val TITLE_ITEM_TYPE = 0
        const val PLAYER_ITEM_TYPE = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoundsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.round_item, parent, false)
        return RoundsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RoundsViewHolder, position: Int) {
        holder.init(rounds[position])
    }

    override fun getItemCount(): Int {
        return getItemsSize()
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    inner class RoundsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun init(round: Round) {
            var title = ""

            round.players.forEach {
                title += " " + it.lastName
            }

            itemView.roundName.text = title
            itemView.setOnClickListener { _ -> roundClickListener.onRoundSelected(round) }
        }
    }

    inner class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun init(player: Player) {

        }
    }

    private fun getItemsSize(): Int {
        return rounds.size
    }
}