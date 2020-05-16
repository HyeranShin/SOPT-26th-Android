package com.hyeran.a3rdseminarhw.data

import com.google.gson.annotations.SerializedName

data class ResponseSignIn(
    val status: Int,
    val success: Boolean,
    val message: String,
    @SerializedName("data")
    val responseData: SomeData?
)

data class SomeData(
    val jwt: String
)