package com.costalopes.module3

fun main(args: Array<String>) {

    var mutableQuestion = Question()
    mutableQuestion = Question()

    val immutableQuestion = Question()
    // immutableQuestion = Question() cannot compile because its immutable

    immutableQuestion.Answer = "mutable answers"
    // immutableQuestion.Question = "" cannot compile because its immutable

    println("The answer to the question ${immutableQuestion.Question} is ${immutableQuestion.Answer}")

}

class Question {

    var Answer: String = ""
    val Question: String = "What is the answer to life, the universe and everything?"

    fun display(): Unit {
        println("You said $Answer") // string template :)
    }

}