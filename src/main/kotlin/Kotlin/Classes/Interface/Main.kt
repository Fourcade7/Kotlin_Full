package Kotlin.Classes.Interface



interface Animal{
    fun eat()
    fun shawerma(){
        println("dont must")
    }
}

class Dog:Animal{
    override fun eat() {
        println("Meat")
    }

    override fun shawerma() {
        super.shawerma()
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