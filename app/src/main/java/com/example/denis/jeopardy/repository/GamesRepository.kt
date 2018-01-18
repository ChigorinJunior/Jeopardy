package com.example.denis.jeopardy.repository

import com.example.denis.jeopardy.domain.Game
import com.example.denis.jeopardy.domain.Player

class GamesRepository {
    fun createGame(players: List<Player>): Game {
        return Game(0, players)
    }
}