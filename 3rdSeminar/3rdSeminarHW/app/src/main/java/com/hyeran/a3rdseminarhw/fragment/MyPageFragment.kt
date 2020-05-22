package com.hyeran.a3rdseminarhw

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyeran.a3rdseminarhw.common.SharedPreferenceController
import com.hyeran.a3rdseminarhw.common.showToast
import kotlinx.android.synthetic.main.fragment_my_page.*

class MyPageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_page, container, false)
    }

    override fun onResume() {
        super.onResume()
        btn_logout.setOnClickListener {
            SharedPreferenceController.setAutoLoginFlag(context!!, false)
            context!!.showToast("자동 로그인이 해제됩니다.")
            startActivity(Intent(context, SignInActivity::class.java))
            activity!!.finish()
        }
    }
}
