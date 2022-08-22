package Kotlin.Functions.Operator_Function








fun main(){

    val google=Google()
    google.plus(5)
}

class Google{
    operator fun plus(a:Int){
        println(a*a)
    }
}







