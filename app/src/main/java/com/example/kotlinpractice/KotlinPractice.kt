package com.example.kotlinpractice

// val = value 초기값이 할당되면 바꿀 수없는 변수
// var = variable 초기값이 할당된 후 바꿀 수 있는 변수
val data1 = 1
var data2 = 1

// 코틀린은 타입지정형과 타입추론형 변수가 존재함
// 변수 명 뒤에 :을 추가하여 타입 명시 가능
// :가 없을 경우 변수값을 유추하여 타입을 정함
val data3: Int = 1

// :가 없지만 변수 타입은 자동으로 String형이 됨
val data4 = "Kotlin"

// 최상위 변수에는 초기값을 할당하여야 하지만 함수 내부의 변수는
// 초기값을 할당하지않아도 됨 하지만 사용 하려면 값이 할당되어야함
// val data5 에러

// 초기값 미루기
// lateinit, lazy 키워드를 이용하여 이후에 초기값을 할당한다고 명시적선언
// var 키워드 변수에만 사용 가능
// Int, Long, Short, Double, Float, Boolean, Byte 타입에는 사용 불가
lateinit var data6: String

// lazy 키워드는 변수가 최초로 이용되는 순간 중괄호 부분이 실행되어 결괏값이 변수의 초기값으로 할당됨
// 여러줄로 작성한다면 마지막 줄의 결과가 변수의 초깃값이 됨
val data7: Int by lazy {
    println("lazy test")
    10
}

// 코틀린의 모든 변수는 객체이며 null을 대입할 수 있음
var data8: Int? = null

// '\' 를 이용하여 특수문자 출력 가능
val str1 = "Hello \\n world"
val str2 = "Hello world"

// 삼중 따옴표 뒤에 trimIndent 함수가 자동으로추가되어 문자열 앞에 공백을 지움
val str3 = """
    Hello
    World
""".trimIndent()

// 함수 선언하기
fun sum(data1: Int, data2: Int): Int {
    // 함수의 매개변수는 val로 적용되며 매개변숫값 변경 불가능
    // data1 = 1 에러
    return data1 + data2
}

fun sum2(data1: Int, data2: Int) = data1 + data2
// 3의 경우 매개변수 값으로 data2를 안넣어 주면 10으로 할당
fun sum3(data1: Int, data2: Int = 10) = data1 + data2

fun main() {
    // data1 = 2 에러
    data2 = 2
    val data5: Int //함수 내부에는 할당없이 선언 가능
    println("data7 = $data7")

    println("str1 = $str1")
    println("str2 = $str2")
    println("str3 = \n$str3")

    // '$'를 사용하여 변숫값이나 결괏값을 출력할 수 있다 (문자열 템플릿)
    println("data1 = $data1")

    // 널 허용과 불허용
    var data9: Int = 10

    // data 9 = null 은 에러
    var data10: Int? = 10
    data10 = null

    println("sum test : "+sum(1, 2))
    println("sum3-1 test : "+sum3(1))
    // 함수의 매개변수명을 지정하여 호출 가능
    println("sum3-2 test : "+ sum3(data1 = 1, data2 = 2))




}