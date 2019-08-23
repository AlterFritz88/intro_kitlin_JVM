import java.util.*
val scan = Scanner(System.`in`)

fun main(args: Array<String>){
    val n = scan.nextInt()
    var arr = IntArray(n)
    for (i in 0..n-1){
        arr[i] = scan.nextInt()
    }
    val k = scan.nextInt()

    var sum = 0
    arr.forEach {
        if (it == k) sum += it
    }
    print(sum)
}