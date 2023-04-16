package Kotlin.Functions.Lambdas


interface Pr{
    fun printinfo(name:String)
    fun printage(age:Int)
}


fun main(){

    val pr=PrHelper({
        println(it)
    })
    pr.printinfo("axaxa")




}

class PrHelper(val prfun:(String)->Unit):Pr{
    override fun printinfo(name: String) {
        prfun(name)
    }

    override fun printage(age: Int) {

    }
}