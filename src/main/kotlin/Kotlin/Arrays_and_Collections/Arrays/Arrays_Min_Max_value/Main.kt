package Kotlin.Arrays_and_Collections.Arrays.Arrays_Min_Max_value





fun main(){

    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    val min=array1.minOrNull()
    val max=array1.maxOrNull()
    println(min)
    println(max)
}