package com.hyeran.a3rdseminarhw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hyeran.a3rdseminarhw.data.RequestSignIn
import com.hyeran.a3rdseminarhw.data.ResponseSignIn
import com.hyeran.a3rdseminarhw.network.RequestToServer
import kotlinx.android.synthetic.main.activity_sign_in.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SignInActivity : AppCompatActivity() {

    private val requestToServer = RequestToServer //싱글톤 그대로 가져옴

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        setEventListener()
    }

    private fun setEventListener() {
        tv_signup_signin.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        btn_login_signin.setOnClickListener {
            if (et_id_signin.text.isNullOrBlank() || et_password_signin.text.isNullOrBlank()) {
                showToast("아이디와 비밀번호를 채워주세요.")
            } else {
                //로그인 요청
                requestToServer.service.requestSignIn(
                    RequestSignIn(
                        id = et_id_signin.text.toString(),
                        password = et_id_signin.text.toString()
                    )
                ).enqueue(object :
                    Callback<ResponseSignIn> { //Callback 등록. Retrofit의 Callback을 import 해줘야 함!
                    override fun onFailure(call: Call<ResponseSignIn>, t: Throwable) {
                        showToast("네트워크 상태를 확인해주세요.")
                    }

                    override fun onResponse(
                        call: Call<ResponseSignIn>,
                        response: Response<ResponseSignIn>
                    ) {
                        val msg: String = response.body()!!.message
                        showToast(msg)
                        //통신 성공
                        if (response.isSuccessful) { //statusCode가 200~300 사이일때. 응답 body 이용 가능
                            if (response.body()!!.success) { //ResponseLogin의 success가 true인 경우 -> 로그인
                                SharedPreferenceController.setAutoLoginFlag(applicationContext, true)
                                showToast("로그인 성공!\n앞으로 자동 로그인됩니다.")
                                startActivity(Intent(this@SignInActivity, MainActivity::class.java))
                                finish()
                            }
                        } else {
                            showToast("로그인 실패")
                        }
                    }
                })
            }
        }
    }
}
