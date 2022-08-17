package Kotlin.Arrays_and_Collections.Arrays.Arrays_Finding_element






fun main(){

    val array1 = arrayOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)
    var search=array1.contains(6)
    var search2=array1.indexOf(6) //search for index
    println(search)
    print(search2)
}