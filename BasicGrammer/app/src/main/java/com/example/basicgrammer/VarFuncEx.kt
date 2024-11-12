package com.example.basicgrammer

fun main() {
    helloWorld()

    println(add(1, 2))

    // 3. String Template

    val name = "한글Joyce"
    val lastName = "Hong"
    println("my name is ${name + lastName} I'm 23")

    println("is this true? ${1==0}")

    println("this is 2\$a")

}

// 1. 함수

// 함수 함수명 : void { , 리턴 타입이 없으면 생략 가능
fun helloWorld() : Unit {
    println("Hello World!")
}

// 변수명을 타입보다 먼저 써주고 반환타입은 마지막에 적어줌
fun add(a : Int, b : Int) : Int {
    return a+b
}

// 2. val vs var
// val = value
// val은 상수이고 var는 변수이다
// 타입 자동 지정, 초기화 없이 선언만 해야할 경우 타입 지정해줘야함
fun hi() {
    val a : Int = 10
    var b : Int = 9

    var e : String

    b = 100

    val c = 100
    var d = 100

    var name = "joyce"
}


