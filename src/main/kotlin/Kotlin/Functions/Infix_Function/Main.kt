package Kotlin.Functions.Infix_Function





fun main(){
    val math=Math()
    println(math kv 5)
}

class Math{
    infix fun kv(a:Int):Int{

        return a*a
    }
}