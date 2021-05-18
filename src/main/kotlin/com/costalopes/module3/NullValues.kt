package com.costalopes.module3

fun main(args: Array<String>) {

    // question mark indicates that this value/variable can be null
    val question: NullableQuestion? = null

    // question mark indicates that this operation should only proceed if question value is not null
    question?.answer = "42"

    // will only call display method if question value is not null
    question?.display()

    println("The answer to the question ${question?.question} is ${question?.answer}")

    val message = if (question?.answer == question?.correct) {
        "You were correct"
    } else {
        "Try again!"
    }

    println(message)

}

// default visibility modifier is public
class NullableQuestion {

    var answer: String? = null
    val correct: String = "42"
    val question: String = "What's the meaning of life?"

    fun display(): Unit {
        println("You said $answer")
    }

}
