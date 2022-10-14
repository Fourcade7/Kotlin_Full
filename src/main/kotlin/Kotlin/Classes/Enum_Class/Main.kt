package Kotlin.Classes.Enum_Class







fun main(){

    val network=Network.CONNECT
    val check=when(network){
        Network.CONNECT -> {"Internet has connected"}
        Network.DISCONNECT -> {"Internet has disconnected"}
    }
    println(check)




    val winter=Season.WINTER
    val pl=PL.values()

    println(winter)
    println(winter.ordinal)

    pl.forEach {
        println(it)
    }
    println(Season.values()[2])


}

enum class Network{
    CONNECT,
    DISCONNECT
}

enum class PL(i: Int) {
    JAVA(1),
    KOTLIN(2),
    PYTHON(3),
    PHP(4),
    JAVASCRIPT(5)
}

enum class Season{
    SUMMER,
    FALL,
    WINTER,
    SPRING
}