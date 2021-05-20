package com.costalopes.module4

fun main(args: Array<String>) {
    val text = "With     multiple \t whitespace"

    // using a helper function
    println(replaceMultipleSpacesHelper(text))

    // using extension function
    println(text.replaceMultipleWhitespaces())

}

fun replaceMultipleSpacesHelper(text: String): String {
    val regex = Regex("\\s+")
    return regex.replace(text, " ")
}

fun String.replaceMultipleWhitespaces(): String {
    val regex = Regex("\\s+")
    return regex.replace(this, " ")
}