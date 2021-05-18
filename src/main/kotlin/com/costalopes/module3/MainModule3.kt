package com.costalopes.module3

fun main(args: Array<String>) {

    var mutableQuestion = Question()
    mutableQuestion = Question()

    val immutableQuestion = Question()
    // immutableQuestion = Question() cannot compile because its immutable

    immutableQuestion.answer = "mutable answers"
    // immutableQuestion.Question = "" cannot compile because its immutable

    println("The answer to the question ${immutableQuestion.question} is ${immutableQuestion.answer}")

    val q = Question()
    q.answer = "42"

    // if statements are expressions and return value! Strings can be compared with equality operator ==
    val message = if (q.answer == q.correct) {
        "You were right"
    } else {
        "Try again?"
    }

    println(message)

}

class Question {

    var answer: String = ""
    val correct: String = "42"
    val question: String = "What is the answer to life, the universe and everything?"

    fun display(): Unit {
        println("You said $answer") // string template :)
    }

}