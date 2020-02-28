package com.taghavi.swoosh.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.taghavi.swoosh.R
import com.taghavi.swoosh.models.PlayerModel
import com.taghavi.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    private lateinit var player: PlayerModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!
    }

    fun onBallerClick(view: View) {
        beginnerSkillButton.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillButton.isChecked = false
        player.skill = "beginner"
    }

    fun onSkillFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
