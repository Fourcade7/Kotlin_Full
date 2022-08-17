package Kotlin.Classes.Class_and_Constructor


fun main(){
    val google=Google()
    val yandex=Yandex("pr")
    yandex.privetyandex()
    val chrome=Chrome(true)
    val youtube=YouTube("Macro Room")
    youtube.showvideo()
    val telegram=Telegram("Fourcade7a")
    telegram.printinfo()
}


class Google{
    fun higoogle()= println("Hello Google")
}

class Yandex(name:String){
    fun privetyandex()= println("privet yandex")

}
class Chrome{
    var type=""
    constructor(type:String){
        this.type=type
    }
    constructor(year:Int):this("Laptop")
    constructor(issue:Boolean)
    fun printinfo()= print(type)
}

class YouTube(videoname:String){
    var videoname:String=""
    init {
            this.videoname=videoname

        }

    fun showvideo()= println(videoname)
}
//empty constuctor with =""
class Telegram constructor(var username:String=""){
    fun printinfo()= println(username)
}
