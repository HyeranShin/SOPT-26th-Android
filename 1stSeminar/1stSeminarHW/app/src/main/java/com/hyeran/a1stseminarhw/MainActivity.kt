package com.hyeran.a1stseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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
            if(SharedPreferenceController.getAutoLoginFlag(this)) {
                Toast.makeText(this, "자동 로그인된 상태입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                startActivity(Intent(this, SignInActivity::class.java))
            }
        }

        tv_autologin_cancel.setOnClickListener {
            SharedPreferenceController.removeAutoLoginFlag(this)
            Toast.makeText(this, "자동 로그인이 해제되었습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}
