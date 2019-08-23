
fun main(args: Array<String>){
    var max = Int.MIN_VALUE
    for (i in 0..3){
        var a = scan.nextInt()
        if (a > max) max = a;
    }
    print(max)
}