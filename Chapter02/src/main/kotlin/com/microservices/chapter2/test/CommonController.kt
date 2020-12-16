package com.microservices.chapter2.test

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by whydda on 12월, 2020
 */
@Controller
class CommonController {

    @GetMapping("/")
    @ResponseBody
    fun hello( ) = "hello world !!!"
}