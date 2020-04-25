package com.hyeran.a1stseminarhw

import android.content.Context
import android.content.SharedPreferences

object SharedPreferenceController {
    private val EMAIL : String = "email"
    private val PASSWORD : String = "password"
    private val AUTO_LOGIN_FLAG : String = "auto_login_flag"

    /**
     * Email
     * String
     */
    fun setEmail(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(EMAIL, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(EMAIL, input)
        editor.commit()
    }

    fun getEmail(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(EMAIL, Context.MODE_PRIVATE)
        return preferences.getString(EMAIL, "")!!
    }

    fun removeEmail(ctx : Context) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(EMAIL, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.remove(EMAIL)
        editor.commit()
    }

    /**
     * Password
     * String
     */
    fun setPassword(ctx: Context, input: String) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(PASSWORD, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putString(PASSWORD, input)
        editor.commit()
    }

    fun getPassword(ctx : Context) : String {
        val preferences : SharedPreferences = ctx.getSharedPreferences(PASSWORD, Context.MODE_PRIVATE)
        return preferences.getString(PASSWORD, "")!!
    }

    fun removePassword(ctx : Context) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(PASSWORD, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.remove(PASSWORD)
        editor.commit()
    }

    /**
     * Auto Login Flag
     * Boolean
     */
    fun setAutoLoginFlag(ctx: Context, input: Boolean) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(AUTO_LOGIN_FLAG, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.putBoolean(AUTO_LOGIN_FLAG, input)
        editor.commit()
    }

    fun getAutoLoginFlag(ctx : Context) : Boolean {
        val preferences : SharedPreferences = ctx.getSharedPreferences(AUTO_LOGIN_FLAG, Context.MODE_PRIVATE)
        return preferences.getBoolean(AUTO_LOGIN_FLAG, false)
    }

    fun removeAutoLoginFlag(ctx : Context) {
        val preferences : SharedPreferences = ctx.getSharedPreferences(AUTO_LOGIN_FLAG, Context.MODE_PRIVATE)
        val editor : SharedPreferences.Editor = preferences.edit()
        editor.remove(AUTO_LOGIN_FLAG)
        editor.commit()
    }
}