package Kotlin.Threads.Synchronization



fun main(){
        val table=Table()
        val google=Google(table)
        val google2=Google(table)
        google.start()
        google2.start()


}

class Table{
    fun printinfo(){
        synchronized(this){
            for (i in 0 until 10){
                Thread.sleep(1_000)
                println(i)
            }
        }
    }


}

class Google constructor(val table:Table):Thread(){

    override fun run() {
        super.run()
        table.printinfo()
    }
}
