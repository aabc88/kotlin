package com.example.kotlinpractice

open class Super(name: String) {

}

class Sub : Super {
    constructor(name: String) : super(name) {

    }
}

open class Main() {
    var mainData = 10
    open fun mainFun() {
        println("mainFun mainData : $mainData")
    }
}

class SubMain : Main() {
    override fun mainFun() {
        println("ovrride function")
    }
}

// 일반 클래스와 데이터 클랙스
class NonDataClass(val name: String, val email: String, val age: Int)
data class DataClass(val name: String, val email: String, val age: Int)

open class SuperObj {
    open var data = 10
    open fun some() {
        println("SuperObj some() : $data")
    }
}

val obj2 = object : SuperObj() {
    override var data = 10
    override fun some() {
        println("OBJClass some() : $data")
    }
}

fun main() {
    val obj = SubMain()
    obj.mainData = 20
    obj.mainFun()

    val non1 = NonDataClass("hej", "hej@abc.com", 27)
    val non2 = NonDataClass("hej", "hej@abc.com", 27)
    val data1 = DataClass("hej", "hen@abc.com", 27)
    val data2 = DataClass("hej", "hen@abc.com", 27)

    // 일반 클래스는 객체를 비교하므로 false
    // 데이터 클래스는 객체의 데이터를 비교하므로 true
    println(non1 == non2)
    println(data1 == data2)

    obj2.data = 20
    obj2.some()

}