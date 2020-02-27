package com.taghavi.swoosh.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.taghavi.swoosh.R
import com.taghavi.swoosh.utilities.EXTRA_LEAGUE

class SkillActivity : AppCompatActivity() {
   private var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)!!
    }
}
