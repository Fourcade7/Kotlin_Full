package Kotlin.Functions.Higher_order_function






fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {
    val result = fn(org,portal)
    println(result)
}

fun main(){
    val fn:(String,String)->String={org,portal->"$org develop $portal"}
    myFun("pr.org","fourcade.com",fn)
}