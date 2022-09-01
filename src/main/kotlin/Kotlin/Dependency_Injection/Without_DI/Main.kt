package Kotlin.Dependency_Injection.Without_DI

/*
This is not an example of dependency injection because the Car class is constructing its own Engine. This can be problematic because:

Car and Engine are tightly coupled - an instance of Car uses one type of Engine, and no subclasses or alternative implementations can easily be used. If the Car were to construct its own Engine, you would have to create two types of Car instead of just reusing the same Car for engines of type Gas and Electric.

The hard dependency on Engine makes testing more difficult. Car uses a real instance of Engine, thus preventing you from using a test double to modify Engine for different test cases.
 */


fun main(){
        val car=Car()
        car.start()
}

class Car{
    val engine=Engine()
    fun start(){
        engine.startengine()
    }
}

class Engine{

    fun startengine(){
        println("ENGINE STARTED Car driving...")
    }
}