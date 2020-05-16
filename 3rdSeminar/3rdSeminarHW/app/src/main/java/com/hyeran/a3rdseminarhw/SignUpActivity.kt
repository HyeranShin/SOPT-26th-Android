package com.hyeran.a3rdseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hyeran.a3rdseminarhw.data.RequestSignUp
import com.hyeran.a3rdseminarhw.data.ResponseSignUp
import com.hyeran.a3rdseminarhw.network.RequestToServer
import kotlinx.android.synthetic.main.activity_sign_up.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignUpActivity : AppCompatActivity() {

    private val requestToServer = RequestToServer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setEventListener()
    }

    private fun setEventListener() {
        btn_complete_signup.setOnClickListener {
            requestToServer.service.requestSignUp(
                RequestSignUp(
                    id = et_id_signup.text.toString(),
                    password = et_password_signup.text.toString(),
                    name = et_name_signup.text.toString(),
                    email = et_email_signup.text.toString(),
                    phone = et_phone_signup.text.toString()
                )
            ).enqueue(object: Callback<ResponseSignUp> {
                override fun onFailure(call: Call<ResponseSignUp>, t: Throwable) {
                    Toast.makeText(this@SignUpActivity, "네트워크 상태를 확인해주세요.", Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(
                    call: Call<ResponseSignUp>,
                    response: Response<ResponseSignUp>
                ) {
                    if(response.isSuccessful) {
                        val msg: String = response.body()!!.message
                        Toast.makeText(this@SignUpActivity, msg, Toast.LENGTH_SHORT)
                            .show()
                        if (response.body()!!.success) { //ResponseLogin의 success가 true인 경우 -> 로그인
                            startActivity(Intent(this@SignUpActivity, SignInActivity::class.java))
                            finish()
                        }
                    }
                    else {
                        Toast.makeText(this@SignUpActivity, "빈칸을 모두 채워주세요.", Toast.LENGTH_SHORT).show()
                    }
                }
            })
        }
    }
}
