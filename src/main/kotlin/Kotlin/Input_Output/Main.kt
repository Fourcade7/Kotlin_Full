package Kotlin.Input_Output





fun main(){
    var a= readLine()?.toInt()!!
    var b= readLine()?.toInt()!!
    var c=a+b
    println(c)

    var x= (readLine()?:"0") .toInt()
    var y= (readLine()?:"0").toInt()
    var z= y + x
    println(z)

}