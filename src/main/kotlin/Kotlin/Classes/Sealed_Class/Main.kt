package Kotlin.Classes.Sealed_Class

import Kotlin.Functions.Inline_Function.pr
import kotlin.math.PI
import kotlin.math.pow


sealed class LoadState{
    data class Succes constructor(val data:String):LoadState()
    data class Failure constructor(val error:String):LoadState()
}

fun getLoad(loadState: LoadState):Any{

    val any=when(loadState){
        is LoadState.Succes->{
            loadState.data
        }
        is LoadState.Failure->{
            loadState.error
        }
    }
    return any
}


fun main(){
    println(getLoad(LoadState.Failure("500 ERROR")))

    findArea(Shape.Square(4.0))
    println(Screen.Home.route)

}


fun findArea(shape: Shape){
    when(shape){
        is Shape.Circle -> {
            println(PI*shape.radius.pow(2))
        }
        is Shape.Square -> {
            println(shape.side.pow(2))
        }
    }
}

sealed class Shape{
    class Square(val side:Double):Shape()
    class Circle(val radius:Double):Shape()
}


sealed class Screen(val route:String){
    object Home:Screen(route = "home_screen")
    object Detail:Screen(route = "detail_screen")
}
