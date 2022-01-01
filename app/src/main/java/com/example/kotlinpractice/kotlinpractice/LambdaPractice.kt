package com.example.kotlinpractice

typealias MyFunType = (Int, Int) -> Boolean

fun main() {

    // 람다함수는 중괄호로 표현하며 화살표 좌측은 매개변수 우측은 본문이 온다.
    val sum = { n1: Int, n2: Int -> n1 + n2 }
    println(sum(10, 20))
    // 매개변수가 없는 람다함수
    val lambda = { println("test")}
    lambda()

    // 매개변수가 한개인 람다함수
    val some = {n0: Int -> println(n0)}
    some(0)
    val some2 : (Int) -> Unit = { println(it)}
    some2(1)

    // 별칭을 사용한 람다함수
    val someFun : MyFunType = {no1: Int, no2: Int ->
        no1 > no2
    }
    println(someFun(1, 2))

}