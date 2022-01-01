package com.example.kotlinpractice

// 배열
fun main() {
    // 배열의 타입은 제네릭으로 표현함
    // Int형 배열의 크기는3이며 0으로 초기화한 데이터를 3개 나열한 정수형 배열
    val data1: Array<Int> = Array(3) { 0 }
    // 배열의 데이터에 접근하여 다른값을 할당할 수 있다.
    data1[2] = 1
    for (i in data1.indices)
        println("data1[$i] = " + data1[i])
    // 여러 타입으로 선언 가능
    val booleanArray: BooleanArray = BooleanArray(3) { false }

    // arrayOf() 함수를 사용하면 배열을 선언할 때 값 할당 가능
    val data2 = arrayOf<Int>(0, 1, 2)
    for (i in data2.indices)
        println("data2[$i] = " + data2[i])
    // arrayOf() 함수 또한 여러타입으로 선언 가능
    val intArrayOf = intArrayOf(0, 1, 2)


    // List, Set, Map
    // Collection 인터페이스 타입으로 표현한 클래스 통틀어 컬렉션 타입 클래스라고함

    // List : 순서가 있는 데이터 집합으로 데이터의 중복 하용
    // Set : 순서가 없으며 중복 불허용
    // Map : 키와 값으로 이루어진 데이터 집함으로 순서가 없고 키의 중복은 불허용
    // mutable - 가변
    val list = listOf<Int>(10, 20, 30)
    for (i in list.indices)
        println("list[$i] = " + list[i])

    val list2 = mutableListOf<Int>(10, 20, 30)
    list2.add(3, 40)
    list2[0] = 50
    for (i in list2.indices)
        println("mutableList[$i] = " + list2[i])
    val map = mapOf("asd" to 1, "asdf" to 2)

}