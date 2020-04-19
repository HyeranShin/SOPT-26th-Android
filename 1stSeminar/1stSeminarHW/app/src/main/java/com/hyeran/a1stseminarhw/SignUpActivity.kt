package com.hyeran.a1stseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    private val SIGNUP_SUCCESS: Int = 200

    private lateinit var email: String
    private lateinit var password: String
    private lateinit var passwordCheck: String
    private lateinit var nickname: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setEventListener()
    }

    private fun setEventListener() {
        btn_complete_signup.setOnClickListener {
            email = et_email_signup.text.toString()
            password = et_password_signup.text.toString()
            passwordCheck = et_password_check_signup.text.toString()
            nickname = et_nickname_signup.text.toString()

            if(checkNotBlank() && checkPassword()) {
                val intent = Intent()
                intent.putExtra("email", email)
                intent.putExtra("password", password)
                intent.putExtra("nickname", nickname)

                SharedPreferenceController.let {
                    it.setEmail(this, email)
                    it.setPassword(this, password)
                }

                setResult(SIGNUP_SUCCESS, intent)
                Toast.makeText(this, "회원가입 성공!", Toast.LENGTH_SHORT).show()
                finish()
            }
        }
    }

    private fun checkNotBlank():Boolean {
        if(email.isNotBlank() && password.isNotBlank() && passwordCheck.isNotBlank() && nickname.isNotBlank()) {
            return true
        }
        Toast.makeText(this, "빈칸을 모두 채워주세요.", Toast.LENGTH_SHORT).show()
        return false
    }

    private fun checkPassword():Boolean {
        if(password == passwordCheck) {
            return true
        }
        Toast.makeText(this, "비밀번호가 일치하지 않습니다.", Toast.LENGTH_SHORT).show()

        return false
    }
}
