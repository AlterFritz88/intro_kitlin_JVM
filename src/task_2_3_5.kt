import java.util.Scanner

val scan = Scanner(System.`in`)

fun makeCatVoice(e: Cat11){
    e.voice()
}
open class Cat11 {
    open fun voice() {
        println("Meow meow meow!!!")
    }
}
class HomeCat1(val name: String) : Cat11(){
    override fun voice(){
        println("Meoooooow! Feed me, ${this.name}!")
    }
}
fun main(args: Array<String>) {
    val usualCat = Cat11()        // Создаем обычного кота

    val name = scan.next()      // Считываем имя
    val homeCat = HomeCat1(name) // Передаём в конструктор

    val num = scan.nextInt()

    repeat(num) {
        makeCatVoice(usualCat)
        makeCatVoice(homeCat)
    }
}