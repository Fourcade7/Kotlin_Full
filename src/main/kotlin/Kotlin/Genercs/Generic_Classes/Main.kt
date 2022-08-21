package Kotlin.Genercs.Generic_Classes







fun main(){

    val size=Size(10,20)
    val size2=Size("One","Two")
    size.printinfo()
    size2.printinfo()

}


class Size<T> constructor(var width:T,var height:T){

    fun printinfo(){
        println("width=$width height=$height")
    }


}