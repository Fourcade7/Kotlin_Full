package Kotlin.Threads.Asynchronous_call







fun main(){

    val action={
        Thread.sleep(3000)
        println("this is action")
    }

    val thread=Thread(action)
    thread.start()
}