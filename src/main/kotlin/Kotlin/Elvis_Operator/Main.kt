package Kotlin.Elvis_Operator





fun main(){
    val x: String? = "foo"
    val y: String = x ?: "bar"      // "foo", because x was non-null

    val a: String? = null
    val b: String = a ?: "bar"      // "bar", because a was null
}