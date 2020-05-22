package com.hyeran.a3rdseminarhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyeran.a3rdseminarhw.insta_rv.InstaAdapter
import com.hyeran.a3rdseminarhw.insta_rv.InstaData
import com.hyeran.a3rdseminarhw.insta_rv.ItemDecoration
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var instaAdapter: InstaAdapter
    private val datas = mutableListOf<InstaData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        instaAdapter =
            InstaAdapter(view.context)
        rv_home.addItemDecoration(
            ItemDecoration(
                context!!
            )
        )
        rv_home.adapter = instaAdapter //리사이클러뷰의 어댑터를 instaAdapter로 지정
        loadDatas() //데이터를 임의로 생성하고 어댑터에 전달
    }

    private fun loadDatas() {
        datas.apply {
            add(
                InstaData(
                    userName = "이익준",
                    img_profile = "http://img.lifestyler.co.kr/NewIMG/frontenm/ch/tvn/2020/20200305_doctorlife_info/images/1_img_01.png",
                    img_contents = "https://post-phinf.pstatic.net/MjAyMDAzMThfMjE0/MDAxNTg0NTAxNjIxMDM5.7UwOQtI3eBrO80yAlpk19LeltmoziEfT4z_JP4dZzZYg.zkBHfMQhFiEIyVvW1Hk5Dz2IIljFvTOSadXM3P40iRog.JPEG/IMG_2128.jpg?type=w1200"
                )
            )
            add(
                InstaData(
                    userName = "채송화",
                    img_profile = "http://img.lifestyler.co.kr/NewIMG/frontenm/ch/tvn/2020/20200305_doctorlife_info/images/5_img_01.png",
                    img_contents = "https://post-phinf.pstatic.net/MjAyMDAzMjNfMTAy/MDAxNTg0OTQzNjU2OTE5.vWGpmarJc3CenzzKvKxYaVmHxhTPiKl2AJF3PGbIWgMg.jcKTN2VmRhJisIaaH7wEHnaMwLZjqJ2QmlLkky0jXg8g.JPEG/슬기로운_의사생활_드라마_장면.jpg?type=w1200"
                )
            )
            add(
                InstaData(
                    userName = "김준완",
                    img_profile = "http://img.lifestyler.co.kr/NewIMG/frontenm/ch/tvn/2020/20200305_doctorlife_info/images/3_img_01.png",
                    img_contents = "https://pbs.twimg.com/media/EVtUyeOU0AAb5bv.jpg"
                )
            )
            add(
                InstaData(
                    userName = "안정원",
                    img_profile = "http://img.lifestyler.co.kr/NewIMG/frontenm/ch/tvn/2020/20200305_doctorlife_info/images/2_img_01.png",
                    img_contents = "https://scontent-ssn1-1.xx.fbcdn.net/v/t1.0-9/fr/cp0/e15/q65/90989370_2805284989527479_8231475290035978240_o.jpg?_nc_cat=100&_nc_sid=8024bb&efg=eyJpIjoidCJ9&_nc_ohc=knAcbkHhEXQAX-S737f&_nc_ht=scontent-ssn1-1.xx&_nc_tp=14&oh=852a11a49f2a97e4f156e6808d19e86a&oe=5EC9D471"
                )
            )
            add(
                InstaData(
                    userName = "양석형",
                    img_profile = "http://img.lifestyler.co.kr/NewIMG/frontenm/ch/tvn/2020/20200305_doctorlife_info/images/4_img_01.png",
                    img_contents = "https://pbs.twimg.com/media/EViMi_SU4AEpnUo.jpg"
                )
            )
        }
        instaAdapter.datas = datas
        instaAdapter.notifyDataSetChanged() //데이터가 갱신되었음을 어댑터에게 알려줌
    }
}
