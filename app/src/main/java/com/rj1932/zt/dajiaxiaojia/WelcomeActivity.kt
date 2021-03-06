package com.rj1932.zt.dajiaxiaojia

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.TextView
import java.util.*

class WelcomeActivity : Activity() {
    var passtime : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        startMainActivity()
    }

    private fun startMainActivity() {
        val delayTask: TimerTask = object : TimerTask() {
            override fun run() {
                val mainIntent = Intent(this@WelcomeActivity, AdActivity::class.java)
                startActivity(mainIntent)
                finish()
            }
        }
        val timer = Timer()
        timer.schedule(delayTask, 5000)
    }
}