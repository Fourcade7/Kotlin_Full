package Kotlin.Arrays_and_Collections.Arrays.Arrays_Merging




fun main(){

    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    val array2 = arrayOf(20,5,9,15,46,57,82,16,49,77,51,24)
    val number=7;

    val arrayall=array1+array2+number

    arrayall.forEach {
        println(it)
    }


}