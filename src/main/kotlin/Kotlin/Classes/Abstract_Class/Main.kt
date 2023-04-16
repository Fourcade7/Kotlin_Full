package Kotlin.Classes.Abstract_Class
abstract class Shape {
    var color = ""
    abstract fun fill(color: String)
    fun draw() {
        println(color)
    }
}

class Square : Shape() {
    override fun fill(color: String) {
        this.color = color
    }
}


fun main() {
    val square = Square()
    val shape = Square()
    shape.fill("Red")
    shape.draw()
    println(getLoadState(Succes("200 OK")))

    val adobeCC=AdobeCC()
    adobeCC.windows()
    adobeCC.mac()

}

abstract class LoadState
data class Succes(val data:String):LoadState()
data class Failure(val eror:String):LoadState()

fun getLoadState(loadState: LoadState):Any{
    val any=when(loadState){
        is Succes ->{
            loadState.data
        }
        is Failure ->{
            loadState.eror
        }
        else->{}
    }
    return any
}



abstract class Adobe(){
    abstract  fun windows()
    open fun mac(){
        println("product for mac")
    }
}

class AdobeCC():Adobe(){
    override fun windows() {
        println("for windows")
    }

    override fun mac() {
        println("for mac")
    }
}


