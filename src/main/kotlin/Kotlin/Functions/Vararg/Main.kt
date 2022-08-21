package Kotlin.Functions.Vararg






fun main(){


    val array= arrayOf("Java","Kotlin","JavaScript","Python")
    printinfo("xaxa","Java","Kotlin")
    println(printinfo("Asad",*array))

}

fun printinfo(name:String,vararg nickname:String){
        nickname.forEach {
            println(it)
        }
}