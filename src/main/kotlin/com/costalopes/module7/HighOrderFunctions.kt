package com.costalopes.module7

fun main() {

    val math = Math()
    math.fibonacci(8, { n -> println(n)} ) // 1st way
    math.fibonacci(8) { n -> println(n)} // 2st way
    // if there is only one parameter on the lambda, kotlin names the parameter
    // `it` automatically
    math.fibonacci(8, { println(it) }) // 3rd way
    math.fibonacci(8) { println(it) } // 4th way

    math.fibonacci(8, ::print) // 5th way (function reference)

}

class Math {

    fun fibonacci(limit: Int, action: (Int) -> Unit) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

}