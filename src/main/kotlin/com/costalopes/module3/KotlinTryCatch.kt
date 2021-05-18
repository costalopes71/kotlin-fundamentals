package com.costalopes.module3

import java.lang.NumberFormatException

fun main(args: Array<String>) {

    val q = Question()
    q.answer = "four"

    val number: Int? = try {
        Integer.parseInt(q.answer)
    } catch (e: NumberFormatException) {
        null
    }

    println("Number is $number")

}