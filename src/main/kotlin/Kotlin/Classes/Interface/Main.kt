package Kotlin.Classes.Interface



interface Animal{
    fun eat()
}

class Dog:Animal{
    override fun eat() {
        println("Meat")
    }
}

class Cat:Animal{
    override fun eat() {
        println("Milk")
    }

}



fun main(){

    val animal=Cat()
    animal.eat()


}