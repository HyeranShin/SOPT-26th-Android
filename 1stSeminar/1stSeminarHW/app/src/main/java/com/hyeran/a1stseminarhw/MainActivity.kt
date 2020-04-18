package com.hyeran.a1stseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setEventListener()
    }

    private fun setEventListener() {
        btn_basic1_main.setOnClickListener {
            startActivity(Intent(this, Basic1Activity::class.java))
        }

        btn_basic2_main.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
