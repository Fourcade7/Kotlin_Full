package Kotlin.Alghorithms.Search.Linear_Search






fun main(){
    val myarray= intArrayOf(2,4,6,8,10,12,14,16,18,20)
    print(linearSearch(myarray,6))
}


fun linearSearch(array:IntArray,x:Int):Int{
    var i=0;
    var count=array.size
    while (i<count){
        if (array.get(i)==x){
            return i
        }
        i++
    }

    return 0

}