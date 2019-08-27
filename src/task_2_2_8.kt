import java.util.Scanner

class Car() {
    fun ride(km: Int) {
        println("Поехали!")
        for (i in km downTo 1) println("Осталось ${i} километров")
        println("Приехали!")
    }
}

fun main(args: Array<String>) {
    val car = Car()
    car.ride(scan.nextInt())
}