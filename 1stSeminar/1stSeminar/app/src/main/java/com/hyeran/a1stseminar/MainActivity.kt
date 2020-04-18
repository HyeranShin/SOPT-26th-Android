package com.hyeran.a1stseminar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setEventListener()
    }

    private fun setEventListener() {
        btn_constraint.setOnClickListener {
            startActivity<ConstraintLayoutActivity>()
        }

        btn_linear.setOnClickListener {
            startActivity<LinearLayoutActivity>()
        }

        btn_relative.setOnClickListener {
            startActivity<RelativeLayoutActivity>()
        }
    }
}
