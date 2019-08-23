import java.util.*


fun main(args: Array<String>) {
    val a1 = scan.nextInt()
    val a2 = scan.nextInt()
    val a3 = scan.nextInt()
    var b = (a1 + a2 + a3).toString()
    var c = (b[b.length-1] + b.substring(1..b.length-2) + b[0]).toInt()
    print(c)
}