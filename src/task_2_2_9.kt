import java.util.Scanner

val scan = Scanner(System.`in`)

class Cat(val name: String){
    init {
        println("Создан новый объект типа Cat с именем ${name}")
    }
    fun play(){
        println("Ура, со мной поиграли!")
    }
}

fun main(args: Array<String>) {
    val cat = Cat(scan.next())
    val num = scan.nextInt()

    repeat(num) {
        cat.play()
    }
}