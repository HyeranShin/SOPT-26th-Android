package com.hyeran.a3rdseminarhw.network

import com.hyeran.a3rdseminarhw.data.RequestSignIn
import com.hyeran.a3rdseminarhw.data.RequestSignUp
import com.hyeran.a3rdseminarhw.data.ResponseSignIn
import com.hyeran.a3rdseminarhw.data.ResponseSignUp
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface {
    @POST("/user/signin")
    fun requestSignIn(@Body body: RequestSignIn) : Call<ResponseSignIn>

    @POST("/user/signup")
    fun requestSignUp(@Body body: RequestSignUp) : Call<ResponseSignUp>
}