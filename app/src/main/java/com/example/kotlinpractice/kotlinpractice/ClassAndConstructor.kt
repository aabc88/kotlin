package com.example.kotlinpractice

class User {
    var name = "hong"

    constructor(name: String = "HONG") {
        this.name = name
    }

    fun someFun() {
        println("name : $name")
    }

    class SomeClass {

    }
}


class Test(text: String, number: Int) {
    init {
        println("Test1 text : $text, number : $number")

    }
}

// 매개변수를 함수에서 사용하는 방법
class Test2(val text: String, val number: Int) {

    fun print() {
        println("Test2 text : $text, number : $number")
    }
}

// 보조생성자
class Test3 {
    constructor(name: String) {
        println("constructor(name: String) call")
    }

    constructor(name: String, age: Int) {
        println("constructor(name: String, age: Int) call")
    }
}

// 보조 생성자에 주 생성자를 연결 하려면 this()구문을 이용해야 한다.
class Test4(name: String)   {
    constructor(name: String, age: Int) : this(name) {

    }
}

fun main() {
    val user = User("euijeong")
    val user2 = User()
    user.someFun()
    user2.someFun()

    val test = Test(text = "text", number = 1)
    val test2 = Test2("text", 1)

    test2.print()


    val test31 = Test3("hej", 27)
    val test32 = Test3("hej")
}