package com.microservices.chapter2.test

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by whydda on 12월, 2020
 */
@Controller
class FirstController(val exampleService: ExampleService) {

    @GetMapping("/user/{name}")
    @ResponseBody
    fun hello(@PathVariable name : String) = exampleService.getHello(name)

    @GetMapping("/user/hi/{name}")
    @ResponseBody
    fun hi(@PathVariable name : String) = exampleService.getHi(name)

}