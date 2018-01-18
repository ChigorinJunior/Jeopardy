package com.example.denis.jeopardy.domain

data class Player(
        val id: Int = 0,
        val firstName: String = "",
        val lastName: String = "",
        val patronymicName: String = "",
        val rating: Rating = Rating(0.0),
        val avatar: Avatar = Avatar(0, ""))
