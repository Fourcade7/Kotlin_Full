package Kotlin.Threads.Thread_Join







fun main(){

    val g1=Google()
    val g2=Google()
    g1.start()
    g1.join()
    g2.start()

}

class Google:Thread(){
    fun prinfo(){
        for (i in 0 until 10){
            sleep(1000)
            println(i)
        }
    }

    override fun run() {
        super.run()
        prinfo()
    }
}
