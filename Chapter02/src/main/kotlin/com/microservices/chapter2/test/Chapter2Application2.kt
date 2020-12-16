package com.microservices.chapter2.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@SpringBootApplication
class Chapter2Application2
  fun main(args: Array<String>) {
    runApplication<Chapter2Application2>(*args)
  }
