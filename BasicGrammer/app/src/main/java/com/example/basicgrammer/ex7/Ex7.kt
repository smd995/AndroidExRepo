package com.example.basicgrammer.ex7

// 7. Nullable / NonNull

fun main() {
//    nullCheck()

    ignoreNulls(null)
}

fun nullCheck() {
    // NPE : NULL pointer Exception
    var name : String  = "joyce" // 타입 지정 생략 가능

    var nullName : String? = null // ?로 null 삽입 가능, 타입 지정 생략 불가능

    var nameInUpperCase = name.uppercase()

     var nullNameInUpperCase = nullName?.uppercase() // 굳이?

    // ?: 엘비스 (프레슬리) 연산자

    val lastName : String? = null

    val fullName = name + " " + (lastName?: "NO lastName") // null 값일 경우 디폴트 값 지정

    println(fullName)

}

// !! : 컴파일러한테 널 값이 아니라고 선언해줌, 그냥 널 값을 안 받으면 되지 않나, 걍 안 쓰는 게 나은듯
fun ignoreNulls(str : String?) {
//    val mNotNull : String = str!!
//    val upper = mNotNull.uppercase()

    // null 값이랑 비교하는 테스트
    val email : String? = str
    email?.let {
        println("my email is ${email}")
    }
}