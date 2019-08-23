import java.util.*


fun main(args: Array<String>){
    val a = scan.nextInt()
    val b = scan.nextInt()
    var sum = 0;
    for (i in a..b){
        sum += i;
    }
    print(sum)
}