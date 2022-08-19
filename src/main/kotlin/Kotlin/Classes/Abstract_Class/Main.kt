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
}