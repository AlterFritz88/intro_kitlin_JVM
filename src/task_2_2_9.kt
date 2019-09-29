import java.util.Scanner


class Cat1(val name: String){
    init {
        println("Создан новый объект типа Cat с именем ${name}")
    }
    fun play(){
        println("Ура, со мной поиграли!")
    }
}

fun main(args: Array<String>) {
    val cat = Cat1(scan.next())
    val num = scan.nextInt()

    repeat(num) {
        cat.play()
    }
}