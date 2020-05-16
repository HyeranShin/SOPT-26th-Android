package com.hyeran.a3rdseminarhw.data

data class RequestSignUp(
    val id: String,
    val password: String,
    val name: String,
    val email: String,
    val phone: String
)