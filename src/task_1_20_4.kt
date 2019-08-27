import java.util.*


fun main(args: Array<String>){
    var max = Int.MIN_VALUE
    var a = 0;
    while(scan.hasNext()){
        a = scan.nextInt()
        if (a > max) max = a
    }
    print(max)
}