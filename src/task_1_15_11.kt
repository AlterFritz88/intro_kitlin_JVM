import java.util.*


fun main(args: Array<String>) {
    val a = scan.next()[0]
    if (a.isLetter() and a.isLowerCase()){
        print(a.toUpperCase())
    } else if (a.isLetter() and a.isUpperCase()){
        print(a.toLowerCase())
    } else print("incorrect")

}