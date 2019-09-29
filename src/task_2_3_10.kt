import java.util.Scanner


open class Cat {
    open fun hunt () {
        println("Я охочусь на мышей, ведь я кот!")
    }
}
class HomeCat() : Cat(){
    fun hunt(condi: Boolean){
        if (condi == true){
            super.hunt()
        } else println("Ты че сдурел? Какие мыши? Иди корми меня, ленивая задница!")
    }
}
fun main(args: Array<String>) {

    val homeCat = HomeCat() // Передаём в конструктор
    homeCat.hunt(true)
    homeCat.hunt(condi = false)

}