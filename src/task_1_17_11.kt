import java.util.*


fun main(args: Array<String>) {
    val n = scan.nextInt()
    var words = emptyArray<String>()
    for (i in 1..n){
        words += scan.next().toString()
    }
    words.reverse()
    for (i in 0..n-1) print(words[i].reversed() + " ")
}