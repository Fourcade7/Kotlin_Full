package Kotlin.Functions.Safe_Calls




fun main() {
    val a:String = "Kotlin"
    val b: String? = null

    println(a.length) // Unnecessary safe call
    println(b?.length)
}
