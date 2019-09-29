import java.util.Scanner


class Cat2(val name: String, var age: Int){
    fun printName(){
        println("Кота зовут ${this.name}")
    }
    fun addAge(){
        this.age++
        println("Теперь коту ${this.name} ${this.age} лет")
    }
}

fun main(args: Array<String>) {
    val cat = Cat2(scan.next(), scan.nextInt())
    cat.addAge()
    cat.addAge()
    cat.printName()
}