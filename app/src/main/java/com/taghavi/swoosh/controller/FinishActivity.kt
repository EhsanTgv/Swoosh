package com.taghavi.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taghavi.swoosh.R
import com.taghavi.swoosh.models.PlayerModel
import com.taghavi.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<PlayerModel>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
