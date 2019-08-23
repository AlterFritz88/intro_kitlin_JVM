import java.util.*


fun main(args: Array<String>){
    val a = scan.next().toString()
    val b = scan.next().toString()
    print(a.replace(b, "_"))
    print(' ')
    print(a.length - a.replace(b, "").length)

}