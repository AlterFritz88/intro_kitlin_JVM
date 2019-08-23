import java.util.*

fun check(a1: String, a2: String, ignoreCase: Boolean = true): Boolean{
    if (ignoreCase) return a1[0].toUpperCase() == a2[0].toUpperCase()
    else return a1[0] == a2[0]
}


fun main(args: Array<String>) {
    val s1 = scan.next()
    val s2 = scan.next()
    val b  = scan.nextBoolean()
    print(check(s1,s2,ignoreCase = b))
}