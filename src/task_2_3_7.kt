


open class Cat3 {
    open fun play() {
        println("Meow")
    }
}
class MyCat() : Cat3(){
    override fun play(){
        println("мяу!")
    }
}
fun main(args: Array<String>) {
    val usualCat = Cat3()        // Создаем обычного кота

    val homeCat = MyCat() // Передаём в конструктор
    usualCat.play()
    homeCat.play()

}