package com.hyeran.a3rdseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        if (SharedPreferenceController.getAutoLoginFlag(this)) {
            showToast("자동 로그인 상태입니다.")
            startActivity(Intent(this, MainActivity::class.java))
        } else {
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}
