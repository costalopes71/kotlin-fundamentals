@file:JvmName("DisplayFunctions")
// we can use this annotation to indicate to the compiler that the name should be this

package com.costalopes.module4.functions

fun main(args: Array<String>) {
    display("Hello, World")

    val max = max(32, 2)
    println("Max is: $max")

    // Named parameters
    log(message = "Hello with named parameters")
    log(message = "Hello with named parameters", logLevel = 3)

}

fun display(message: String) : Boolean {
    println(message)
    return true
}

// This is a function expression
fun max(a: Int, b:Int) : Int = if (a > b) a else b

// Default parameters
@JvmOverloads
fun log(message: String, logLevel: Int = 1) {
    println("$message $logLevel")
}
