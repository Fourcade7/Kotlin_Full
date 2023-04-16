package Kotlin.Object_expressions_and_declarations.Object_declarations





fun main(){
 Google.golang()
    Yandex.Russia.moscow()
    Retrofit.gorequest()
}

//for only instance
object Retrofit{

    fun gorequest(){
        println("Connected from server")
    }
}
class Google{
    companion object{
        fun golang(){
            println("new Language")
        }
    }
}

class Yandex{
    companion object Russia{
        fun moscow(){
            println("Moscow is capital")
        }
    }
}
