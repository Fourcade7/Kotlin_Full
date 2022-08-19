package Kotlin.Classes.Inner_Class





fun main(){
    val google=Google.Youtube()
    google.showvideo()
    val chrome=Google().Chrome()
    chrome.showwebsite()
}


class Google{

    class Youtube{
        fun showvideo()= println("video is playing")
    }
    inner class Chrome{
        fun showwebsite()= println("loading website")
    }
}