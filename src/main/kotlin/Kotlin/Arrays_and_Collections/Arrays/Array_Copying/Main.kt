package Kotlin.Arrays_and_Collections.Arrays.Array_Copying





fun main(){
    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    array1[5]=30
    val array2 = array1.copyOf()
    val array3=array1.copyOfRange(2,4)
    val array4=array1.copyOf(4)


    array2.forEach {
        println(it)
    }


}