package com.microservices.chapter2.test

import org.springframework.stereotype.Service

/**
 * Created by whydda on 12월, 2020
 */
@Service
class ExampleService : ServiceInterface {

    fun getHello(name : String) = "hello $name"

    override fun getHi(name: String): String  = "Hi $name"
}