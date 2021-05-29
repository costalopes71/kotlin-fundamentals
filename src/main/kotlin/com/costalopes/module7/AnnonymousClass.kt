package com.costalopes.module7

/**
 * Using an annonymous class
 */
fun main() {

    val program = Program()
    program.fibonacci(8, object : Process {
        override fun execute(value: Int) {
            println(value)
        }
    })

}

/**
 * OO way of implementing the Strategy Pattern
 */
interface Process {
    fun execute(value: Int)
}

class Program {

    fun fibonacci(limit: Int, action: Process) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current) // strategy

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }

    }

    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit) {
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }

    }

}