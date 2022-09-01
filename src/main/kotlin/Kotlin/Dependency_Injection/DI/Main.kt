package Kotlin.Dependency_Injection.DI


fun main() {
    val engine = Engine()
    val car = Car(engine)
    println(car.start())
}

class Car constructor(val engine: Engine) {

    fun start() {
        engine.startengine()
    }
}

class Engine {

    fun startengine() {
        println("ENGINE STARTED Car driving...")
    }
}