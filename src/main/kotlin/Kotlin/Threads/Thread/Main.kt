package Kotlin.Threads.Thread






fun main(){

    val google=Google()
    google.start()
}

class Google:Thread(){

    fun add(a:Int,b:Int){
        sleep(2000)
        println(a+b)
    }

    override fun run() {
        super.run()
        add(2,7)
    }
}