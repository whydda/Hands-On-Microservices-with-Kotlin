package com.microservices.chapter2.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by whydda on 12월, 2020
 */
@Controller
class SecondController {
    /**
     * lateinit 으로 선언하면 이 프로퍼티는 생성자 다음에 초기화 한다는 것을 나타낸다.
     * 생성자의 매개변수로 받고 싶지 않을때 사용...
     * 자바에서는 이런식으로 사용되었던 부분이다.
     *
     * @Autowired
     * private CommonService commonService;
     */
    @Autowired
    lateinit var service: ExampleService

    @GetMapping("/user2/{name}")
    @ResponseBody
    fun hello(@PathVariable name : String) = service.getHello(name)

}