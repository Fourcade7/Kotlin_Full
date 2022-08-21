package Kotlin.Genercs.Generc_Methods






fun main(){

    fun<T> swap(a:Array<T>,b:Array<T>){
        val tmp=a[0]
        a[0]=b[0]
        b[0]=tmp
    }

    val array1= arrayOf(2)
    val array2= arrayOf(7)

    val names1= arrayOf("Asad")
    val names2= arrayOf("Fourcade")

    swap(array1,array2)
    swap(names1,names2)

    println(array1.get(0))
    println(names1.get(0))

}

