import java.util.*


fun main(args: Array<String>) {
    val a = (scan.nextLong() + 1).toString()
    var b = a.subSequence(0, a.length - 2).toString() +"Σ" + a[a.length - 1]
    print(b)
}