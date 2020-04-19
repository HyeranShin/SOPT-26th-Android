package com.hyeran.a1stseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    private val SIGNUP_REQUEST: Int = 1
    private val SIGNUP_SUCCESS: Int = 200

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        setEventListener()
    }

    private fun setEventListener() {
        tv_signup_signin.setOnClickListener {
            startActivityForResult(Intent(this, SignUpActivity::class.java), SIGNUP_REQUEST)
        }

        btn_login_signin.setOnClickListener {
            if(et_id_signin.text.toString() == SharedPreferenceController.getEmail(this)
                && et_password_signin.text.toString() == SharedPreferenceController.getPassword(this)) {
                SharedPreferenceController.setAutoLoginFlag(this, true)
                Toast.makeText(this, "로그인 성공!\n앞으로 자동 로그인됩니다.", Toast.LENGTH_SHORT).show()
                finish()
            }
            else {
                Toast.makeText(this, "로그인 실패!\n이메일과 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == SIGNUP_REQUEST) {
            if(resultCode == SIGNUP_SUCCESS) {
                et_id_signin.setText(data!!.getStringExtra("email"))
                et_password_signin.setText(data!!.getStringExtra("password"))
            }
        }
    }
}
