package com.costalopes.module5

/*
Sealed classes can ofter be used where Enums were used. They are abstract classes
that only allow classes declared inside it to extend the sealed class
Sealed classes let us restrict class Hierarchies
 */
sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String): PersonEvent()
}

// because it is a sealed class we know that it only has limited types, so we dont
// need the else statement on the when clause
fun handlePersonEvent(event: PersonEvent) {
    when (event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}