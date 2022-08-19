package Kotlin.Classes.Lazy_Properties




fun main(){

    val google=Google()
    google.chrome

}

class Google(){
    val chrome by lazy {
        Chrome()
    }
}

class Chrome(){
    init {
        println("This is init block")

    }
}