package com.example.highlevelgrammer.ex1

// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 잇는 익명함수이다.
// 함수형 프로그래밍을 통해 특정 행위를 통해 반환값을 출력하기 때문인 것으로 추측됨
// 1) 메서드의 파라미터로 넘겨줄 수가 있다. fun maxBy(a : Int)
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}
// 타입 람다함수명 : (입력타입) -> (반환타입) = {입력값 -> 반환값로직}
// 타입 함수명 = {입력값 : 입력타입 -> 반환값로직}
val square1 : (Int) -> (Int) = {number -> number * number}
val square2 = {number : Int -> number * number}

// 타입 변수명 = {입력값1 : 입력타입1, 입력값2 : 입력타입2 ->
//  반환로직 }
val nameAge = {name : String, age : Int ->
    "my name is $name I'm $age"
}

fun main() {
    println(square1(13))
    println(square2(18))
    println(nameAge("joyce", 99))

    val a = "joyce said "
    val b = "mac said "

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(97))
    println(calculateGrade(971))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda (lamda))
    println(invokeLamda({it > 3.22}))

    val invokeLamda = invokeLamda { it > 3.22 }
    println(invokeLamda)
}


// 확장함수
// 스트링 리터럴에 확장함수를 추가할 수 있음 - this로 받아와서 사용
// 타입 함수명 : 기본변수타입.() -> 반환변수타입 = { 반환값로직 }
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

// 타입 함수명(매개변수) : 반환타입 {
// 반환로직
// return 반환값 }
// this - 첫번째 매개변수, it - 두번째 매개변수
fun extendString(name : String, age : Int) : String {

    val introduceMyself : String.(Int) -> String = {
        "I am $this and $it years old"
    }

    return name.introduceMyself(28)
}

// 람다의 return
val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}