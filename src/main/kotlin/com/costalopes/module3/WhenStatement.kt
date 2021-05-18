package com.costalopes.module3

fun main(args: Array<String>) {

    val q = QuestionUsingWhen()
    q.answer = "42"
    q.printResult()

}

class QuestionUsingWhen {

    val correct: String = "42"
    val question: String = "Is Trakinas a kind of drug?"
    var answer: String? = null

    fun display(): Unit {
        println("You said $answer")
    }

    fun printResult() {

        when(answer) {
            correct -> print("You were correct")
            else -> print("Try again?")
        }

    }

}