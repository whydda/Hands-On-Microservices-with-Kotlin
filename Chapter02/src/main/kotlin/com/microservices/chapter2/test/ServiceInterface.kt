package com.microservices.chapter2.test

/**
 * Created by whydda on 12월, 2020
 */
interface ServiceInterface {
    /*
     * 코틀린은 (변수 : 변수 타입) : 리턴 타입으로 나타 낸다.
     */
    fun getHi(name : String) : String
}