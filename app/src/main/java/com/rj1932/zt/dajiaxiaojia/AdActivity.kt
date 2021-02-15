package com.rj1932.zt.dajiaxiaojia

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import java.util.*

class AdActivity : Activity() {

    val jump = false
    val jumpTime = 5
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advertise)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        startMainActivity()
    }

    private fun startMainActivity() {
        val delayTask: TimerTask = object : TimerTask() {
            override fun run() {
                val mainIntent = Intent(this@AdActivity, MainActivity::class.java)
                startActivity(mainIntent)
                finish()
            }
        }
        val timer = Timer()
        timer.schedule(delayTask, 2000)
    }

}