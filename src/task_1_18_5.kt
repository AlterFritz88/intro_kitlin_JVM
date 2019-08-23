import java.util.*

fun isCaseEquals(c1: Char, c2: Char) : Boolean{
    if ((c1.isUpperCase() and c2.isUpperCase()) or (c1.isLowerCase() and c2.isLowerCase())) return true
    else return false
}


fun main(args: Array<String>) {
    val c1 = scan.next()[0]
    val c2 = scan.next()[0]
    print(isCaseEquals(c1,c2))
}