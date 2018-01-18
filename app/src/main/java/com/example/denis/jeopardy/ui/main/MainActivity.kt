package com.example.denis.jeopardy.ui.main

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.example.denis.jeopardy.R
import com.example.denis.jeopardy.ui.players.PlayersFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    enum class Screens {
        PLAYERS,
        GAMES
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                setCurrentScreen(Screens.PLAYERS)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    private fun setCurrentScreen(screen: Screens) {
        when(screen) {
            MainActivity.Screens.PLAYERS -> {
                var playersFragment = supportFragmentManager.findFragmentByTag("123")

                if (playersFragment == null) {
                    playersFragment = PlayersFragment()
                }

                supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainer, playersFragment, "123")
                        .commit()
            }
            MainActivity.Screens.GAMES -> {}
        }
    }
}