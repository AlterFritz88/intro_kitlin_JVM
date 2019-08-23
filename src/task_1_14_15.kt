import java.util.*


fun main(args: Array<String>){
    val a = scan.next()
    val b = scan.next()
    when {
        a[a.length - 1] == b[0]  -> print(3)
        a[0] == b[0]             -> print(1)
        a.length == a.replace(b, "").length -> print(4)
        else -> print(2)
    }
}