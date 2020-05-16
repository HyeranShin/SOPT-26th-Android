package com.hyeran.a3rdseminarhw.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//싱글톤. 코드 아무데서나 접근 가능하고, 객체는 단 하나만
object RequestToServer {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://13.209.144.115:3333")
        .addConverterFactory(GsonConverterFactory.create()) //Retrofit으로 받아온 json 데이터를 데이터 클래스로 변환하기 쉽게 해줌
        .build()

    //retrofit 객체의 create 호출. Interface 클래스 타입을 넘겨 실제 구현체를 만들어준다.
    var service: RequestInterface = retrofit.create(RequestInterface::class.java)
}