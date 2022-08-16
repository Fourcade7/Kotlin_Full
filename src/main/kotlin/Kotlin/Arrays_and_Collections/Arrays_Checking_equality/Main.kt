package Kotlin.Arrays_and_Collections.Arrays_Checking_equality





fun main(){


    val array1 = arrayOf(1,2,3)
    val array2 = arrayOf(1,2,3)
    val array3 = arrayOf(3,2,1)

    val equal1= array1 contentEquals array2
    val equal2= array1 contentEquals array3

    println(equal1)
    println(equal2)

}
