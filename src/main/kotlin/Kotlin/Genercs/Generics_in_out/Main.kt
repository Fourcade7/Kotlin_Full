package Kotlin.Genercs.Generics_in_out


open class Phone constructor(val os: String) {
    fun printOS() {
        println("Operanting system is $os")
    }
}

class Ios : Phone("IOS")
class Android : Phone("Android")
class Adobe


class ProducerPhone<out T>(val phone: T) {
    fun getTypeOS(): T = phone
}
class ConsumerPhone<in T>{
    fun printPhone(phone:T){
        println(phone.toString())
    }
}


fun main() {

    val producer=ProducerPhone(Android())
    producer.phone.printOS()

    val consumer=ConsumerPhone<Phone>()
    consumer.printPhone(Phone("IOS"))
}