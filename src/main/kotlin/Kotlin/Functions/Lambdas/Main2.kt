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

    //MyClass   :: convert to lambda
    fun myage(age: Int){
        println("Your age is $age")
    }
    val myClass=MyClass(::myage)

    myClass.printinfo(25)




}

class PrHelper(val prfun:(String)->Unit):Pr{
    override fun printinfo(name: String) {
        prfun(name)
    }

    override fun printage(age: Int) {

    }
}


class MyClass(val printage:(Int)->Unit){

    fun printinfo(age:Int){
        printage(age)
    }
}