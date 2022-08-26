package Kotlin.Genercs.Class_Confirmity







fun main(){
    val service= Service<Truck>()
    service.test()


}


open class Vehicle(){


}

class Car:Vehicle(){

}

class Truck:Vehicle(){

}



class Service<T:Vehicle>{
    fun test(){
        println("Test started")
    }
}