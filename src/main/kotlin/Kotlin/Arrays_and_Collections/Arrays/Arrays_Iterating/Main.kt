package Kotlin.Arrays_and_Collections.Arrays.Arrays_Iterating






fun main(){

    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    var str=""
    for (item in array1){
        if (str.length>0){
            str=str+"; "
        }
        str=str+item.toString()
    }

    print(str)
}