import com.costalopes.Person

fun main(args: Array<String>) {
    println("Hello World")

    // val makes it immutable
    val kevin = Person("Kevin")

    println("Person name: ${kevin.Name}")

    kevin.Name = "Steve"
    println("Person name: ${kevin.Name}")
    kevin.display()

    kevin.displayWithLambda(::printName)

}

fun printName(name: String) {
    println(name)
}