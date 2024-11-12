package com.example.basicgrammer.ex5

// 5. Array and List

// Array : 처음에 크기가 정해짐, 크기 변경 불가능

// List - Immutable vs Mutable
fun arrayFuncEx() {
    val arr = arrayOf(1,2,3)
    val list = listOf(1,2,3) // 읽기 전용 리스트

    val arr2 = arrayOf(1,"d", 3.4f)
    val list2 = listOf(1,"d",11L)

    arr[0] = 3
//    list[0] = 2 // 에러
    var result = list.get(0)

    // Mutable List는 set 메서드를 가지고 있기 때문에 값을 변경가능
    // ArrayList는 대표적인 Mutable List
    val arrayList = arrayListOf<Int>() // 참조값이 변하지 않기 때문에 var로 선언할 이유가 없음

    arrayList.add(10)
    arrayList.add(20)

//    arrayList = arrayListOf() 에러, 다시 할당될 수 없음
}