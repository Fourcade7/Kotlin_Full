package Kotlin.Classes.Extends_Open_Class



open class Dog{
    fun voice():String="axax"
}

class Cat:Dog(){

}



fun main(){
    val cat=Cat()
   println(cat.voice())


}