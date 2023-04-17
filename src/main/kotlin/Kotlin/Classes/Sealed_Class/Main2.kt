package Kotlin.Classes.Sealed_Class

import Kotlin.Functions.Inline_Function.pr


sealed class Google{
    class Youtube():Google(){
        fun playvideo(){
            println("video is playing")
        }
    }
    class Chrome():Google()
}


fun main(){

    val google=Google.Youtube()
    google.playvideo()

}