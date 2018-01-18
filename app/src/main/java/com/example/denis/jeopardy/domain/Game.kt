package com.example.denis.jeopardy.domain

class Game(val id: Int, val players: List<Player>) {
    val rounds: List<Round> = listOf(Round(0, players, emptyList()))
}