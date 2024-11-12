package com.example.basicgrammer.ex4

fun main() {

    checkNum(1)

}

// 4. 조건식

fun maxBy(a : Int, b : Int) : Int {

    if (a > b) {
        return a;
    }
    else {
        return b;
    }
}

fun maxBy2(a : Int, b: Int) = if (a>b) a else b

fun checkNum(score : Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3") // 복수 선택 가능
        else -> println("I don't know") // default 값 설정, else가 없어도 됨
    }

    var b = when(score) {
        1 -> 1
        2 -> 2

        else -> 3 // else가 없으면 안됨, 초기화를 해주어야하기 때문이라고 추측
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius") // ..으로 범위 설정
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement
//      값    vs    값 X
// 코틀린에서 모든 함수는 Expression, Unit을 반환하기 때문에
// 조건식은 Expression 또는 Statement로 사용할 수 있음

