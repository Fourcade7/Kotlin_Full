package Kotlin.Object_expressions_and_declarations.Object_declarations





fun main(){
 Google.golang()
    Yandex.Russia.moscow()
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
