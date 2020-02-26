package com.taghavi.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    private var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked() {
        womensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked() {
        mensLeagueButton.isChecked = false
        coedLeagueButton.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked() {
        mensLeagueButton.isChecked = false
        womensLeagueButton.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked() {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }
}
