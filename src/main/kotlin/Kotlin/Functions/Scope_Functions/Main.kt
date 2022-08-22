package Kotlin.Functions.Scope_Functions








fun main(){
    val g1=Google().let {
        it.name="Fourcade"
        it.youtube()
        it
    }
    val g2=Google().also {
        it.name="Fourcade"
        it.youtube()
        it
    }

    val g3=Google().apply {
        this.name="Fourcade"
        this.youtube()
        this
    }

    val g4= with(Google()){
        this.name="Fourcade"
        this.youtube()
        this
    }


    val g5=Google().run {
        this.name="Fourcade"
        this.youtube()
        this
    }






}

class Google{
    var name:String="Play Google"
    fun youtube(){
        println("video is playing")
    }
}