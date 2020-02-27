package com.taghavi.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.taghavi.swoosh.R
import com.taghavi.swoosh.utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
    }

    fun onBallerClick(view: View) {
        beginnerSkillButton.isChecked = false
        skill = "baller"
    }

    fun onBeginnerClick(view: View) {
        ballerSkillButton.isChecked = false
        skill = "beginner"
    }
}
