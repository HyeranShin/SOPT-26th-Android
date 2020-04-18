package com.hyeran.a1stseminar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_linear_layout.*
import org.jetbrains.anko.startActivity

class LinearLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        btn_complete.setOnClickListener {
//            startActivity<RelativeLayoutActivity>()
            finish()
        }
    }
}
