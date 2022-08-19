package Kotlin.Functions.Function_Simple








fun main(){

    hello()
    salom()
    personage()
    personage2()
    printinfo("Fourcade",7)


    println(sum(4,5))
    println(add(7,8))

    rec()

    run(7)
}

fun hello(){
    println("Assalomaleykum")
}

fun salom()= println("Assalomaleykum")

fun personage():Int{
    return 7
}

fun personage2():Int=8

fun printinfo(name:String,age:Int)=println(name)

fun sum(a:Int,b:Int):Int=a+b
fun add(num1:Int,num2:Int):Int{
    var sum=num1+num2
    return sum
}

var count = 0
fun rec(){

    count++;
    if(count<=5){
        println("hello "+count);
        rec();
    }
}

fun run(num:Int= 5, latter: Char ='x'){
    print("parameter in function definition $num and $latter")
}