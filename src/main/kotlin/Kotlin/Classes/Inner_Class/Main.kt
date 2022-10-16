package Kotlin.Classes.Inner_Class





fun main(){
    val google=Google.Youtube()
    google.showvideo()
    val chrome=Google().Chrome()
    chrome.showwebsite()
}


class Google{
    val name="Google LLC"
    class Youtube{
        fun showvideo()= println("video is playing ") //can not use name
    }
    inner class Chrome{
        fun showwebsite()= println("loading website $name")
    }
}