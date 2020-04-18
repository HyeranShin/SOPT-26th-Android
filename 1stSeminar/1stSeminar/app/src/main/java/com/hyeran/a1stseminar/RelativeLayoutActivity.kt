package com.hyeran.a1stseminar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_relative_layout.*
import org.jetbrains.anko.startActivity

class RelativeLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        btn_login.setOnClickListener {
            if(et_id.text.isNullOrBlank() || et_password.text.isNullOrBlank()) {
                Toast.makeText(this, "아이디/비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
            }
            else {
                startActivity<MainActivity>()
            }
        }

        tv_signup.setOnClickListener {
            startActivity<LinearLayoutActivity>()
        }
    }
}
