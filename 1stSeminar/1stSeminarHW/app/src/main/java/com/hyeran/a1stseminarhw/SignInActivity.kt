package com.hyeran.a1stseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
