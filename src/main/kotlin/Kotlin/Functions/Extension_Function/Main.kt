package Kotlin.Functions.Extension_Function








fun main(){

    val car=Car()
    car.drive()
    car.stop()
    val a=3
    a.kv(3)
    a.juft()

}

fun Int.juft(){
    if (this%2==0){
        println("Juft son")
    }
}

fun Int.kv(a:Int){
    println(a*a)
}

fun Car.stop(){
    println("car is stopping")
}



class Car{
    fun drive(){
        println("car is driving")
    }
}