package com.example.springhelloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// @RestController: アノテーションされたクラスのメソッドの戻り値がHTTPリクエストの戻り値となる
@RestController
class HelloWorldController {
    // @GetMapping: アノテーションされたメソッドに対して、リクエストメソッドとパスを指定する
    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello World"
    }
}