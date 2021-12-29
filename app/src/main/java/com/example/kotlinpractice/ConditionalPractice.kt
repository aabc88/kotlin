package com.example.kotlinpractice

// 조건문
fun main() {
    var data = 0
    if (data > 0)
        println("data > 0")
    else if (data < 0)
        println("data < 0")
    else
        println("data = 0")

    var result = if (data > 0) {
        println("data > 0")
        true
    } else if (data < 0) {
        println("data < 0")
        true
    } else {
        println("data = 0")
        false
    }

    println("result = $result")

    // when 조건문 (= 자바의 switch와 유사)
    when (data) {
        1 -> println("data == 1")
        2 -> println("data == 2")
        else -> println("else")
    }

    // when 조건문에 문자열도 가능
    val data2 = "hello"
    when (data2) {
        "hello" -> println("data2 = hello")
        "world" -> println("data2 = world")
        else -> println("else")
    }

    // when문을 if문 처럼 사용 가능
    when {
        data <= 0 -> println("data is <= 0")
        data > 100 -> println("data is > 100")
        else -> println("else")
    }

}