package com.costalopes.module7

/**
 * Kotlin lambdas can mutate values. There is no need for the value to be immutable
 */
fun main() {
    val math = Math2()
    var total = 0

    math.fibonacci(8) { it -> total += it}
    println(total)
}

class Math2 {

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