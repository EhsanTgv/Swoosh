package com.taghavi.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.taghavi.swoosh.R
import com.taghavi.swoosh.models.PlayerModel
import com.taghavi.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    private var player = PlayerModel("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view:View) {
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view:View) {
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view:View) {
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view:View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
