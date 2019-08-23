import java.util.*


fun main(args: Array<String>) {
    var arr = IntArray(10)
    for (i in 0..9) arr[i] = scan.nextInt()
    arr.reverse()
    for (i in 0..9) print("${arr[i]} ")
}