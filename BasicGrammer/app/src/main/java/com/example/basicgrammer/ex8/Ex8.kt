package com.example.basicgrammer.ex8

// 8. 클래스
// 코틀린은 자바랑 다르게 클래스명과 파일명이 일치할 필요도 없고
// 하나의 파일에 여러 개의 클래스를 생성하는 게 가능
fun main() {
    val human = Human("minsu")
    val stranger = Human()
    human.eatingCake()
    println("this human's name is ${human.name}")
    println("this human's name is ${stranger.name}")

    val mom = Human("Kuri", 52)
    println("this human's name is ${mom.name}")

    val korean = Korean()
    println(korean.singAsong())
}

// 클래스는 자바와 똑같이 생성자, 프로퍼티(변수), 메서드로 이루어져있음
// 클래스에는 주 생성자와 부 생성자가 있음 주 생성자에는 디폴트 값 설정가능
// 부 생성자는 this()를 받아서 주 생성자의 매개변수를 받음
// open을 통해서 public처럼 사용
open class Human constructor( val name: String = "Anonymous") {
//    val name = name // 클래스변수, 멤버변수

    constructor(name:String, age:Int) : this(name) {
        println("my name is ${name}, ${age} years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake() { // 메서드
        println("This is so YUMMYYYYY~~~")
    }

    open fun singAsong() {
        println("lalala")
    }
}

// 코틀린은 기본적으로 파이널 클래스임
class Korean : Human() {

    override fun singAsong() {
        println("lalala in korean")
        println("my name is ${name}")
    }

}
