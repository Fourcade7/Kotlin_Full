package Kotlin.Threads.Thread

import kotlin.concurrent.thread


fun main(){

    val google=Google()
    google.start()

    val th=Thread{
        println("new thread created")
    }
    th.start()
    thread {
        println("this is a new thread with lambdas")
    }
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