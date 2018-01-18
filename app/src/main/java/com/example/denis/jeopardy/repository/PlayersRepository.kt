package com.example.denis.jeopardy.repository

import com.example.denis.jeopardy.domain.Avatar
import com.example.denis.jeopardy.domain.Player
import com.example.denis.jeopardy.domain.Rating
import io.reactivex.Flowable

class PlayersRepository {
    fun getPlayers(): Flowable<List<Player>> {
        return Flowable.just(listOf(
                Player(id = 50, firstName = "Денис", lastName = "Макаров", rating = Rating(1312.17), avatar = Avatar(url = "https://pp.userapi.com/c6088/v6088352/3cf5/XPLny3VHmFI.jpg")),
                Player(id = 51, firstName = "Маргарита", lastName = "Макарова", rating = Rating(1312.17), avatar = Avatar(url = "https://pp.userapi.com/c639521/v639521672/1d94e/ZWfESDv7V-8.jpg")),
                Player(id = 15, firstName = "Артем", lastName = "Рожков", rating = Rating(1915.63), avatar = Avatar(url = "https://pp.userapi.com/c628230/v628230090/84c3/u38AvWcQaNM.jpg")),
                Player(id = 11, firstName = "Евгений", lastName = "Кузнецов", rating = Rating(1021.86), avatar = Avatar(url = "https://pp.userapi.com/c637321/v637321553/1e96f/5Z5nNaTYCNU.jpg")),
                Player(id = 24, firstName = "Алёна", lastName = "Мишутина", rating = Rating(807.07), avatar = Avatar(url = "https://pp.userapi.com/c637523/v637523150/7a90a/KqvyxOaaPVU.jpg")),
                Player(id = 16, firstName = "Алёна", lastName = "Хохлачёва", rating = Rating(1504.80), avatar = Avatar(url = "https://pp.userapi.com/c306911/v306911617/a524/CuGrxCUIL6E.jpg")),
                Player(id = 35, firstName = "Павел", lastName = "Дадыкин", rating = Rating(782.04), avatar = Avatar(url = "https://pp.userapi.com/c834402/v834402155/30b92/XaDNy7jrJ-U.jpg")),
                Player(id = 28, firstName = "Кирилл", lastName = "Буров", rating = Rating(969.26), avatar = Avatar(url = "https://pp.userapi.com/c639716/v639716277/49f2d/iIJmbqX0nxs.jpg")))
        )
    }
}