package Kotlin.Object_expressions_and_declarations

import Kotlin.Functions.Function_Simple.hello


fun main(){

    val helloworld=object {
        val hello="Hello"
        val world="World"
        fun printinfo(){
            println(hello)
            println(world)
        }


    }
    val google=object : Google {
        override fun youtube() {
            println("video is playing")
        }

        override fun golang() {
            TODO("Not yet implemented")
        }
    }

    val yandex=object : Yandex() {
        override fun taxi() {
            println("GAZEL")
        }
    }


   helloworld.printinfo()
    google.youtube()
    yandex.taxi()
    yandex.grad()

}

interface Google{
    fun youtube()
    fun golang()
}

open class Yandex{

    open fun taxi(){
        println("taxi is driving")
    }
    fun grad(){
        println("go attack")
    }

}