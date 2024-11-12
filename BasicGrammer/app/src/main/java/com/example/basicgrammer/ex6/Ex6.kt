package com.example.basicgrammer.ex6

// 6. For / While

fun main() {
    forEx()

//    whileEx()
}

fun forEx() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students) {
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index+1}th student : ${name}")
    }

    var sum1 = 0
    for (i in 1..10) {
        sum1 += i
    }
    println(sum1)

    var sum2 = 0
    for (i in 1..10 step 2) {
        sum2 += i
    }
    println(sum2)

    var sum3 = 0
    for (i in 10 downTo 1) { // 10부터 1까지
        sum3 += i
    }
    println(sum3)

    var sum4 = 0
    for (i in 1 until 100) { // 1..100과 달리 100을 포함하지 않는다
        sum4 += i
    }
    println(sum4)


}

fun whileEx() {

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }
}