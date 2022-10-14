package Kotlin.Delegation.by_keyeword

import kotlin.properties.Delegates


interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()

    val user=User()
    user.name="pr"
    user.name="ae"


}

class User {

    var name: String by Delegates.observable("Welcome to Tutorialspoint.com") {
            prop, old, new ->
        println("$old -> $new")
    }
}