package com.example.denis.jeopardy.domain

import java.io.Serializable

class Round(
        val id: Int,
        val players: List<Player>,
        val scores: List<Score>): Serializable {
/*
    fun getWinners(): List<Player> {
        scores.groupBy { it.playerId }
                .map { it -> Pair(it.key, it.value.sumBy { it.value }) }
                .sortedBy { it.second }
    }*/
}