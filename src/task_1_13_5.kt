
fun main(args: Array<String>){
    var a: IntArray = intArrayOf(0, 0, 0, 0)
    for (i in 0..3){
        a[i] = scan.nextInt()
    }
    var cond = scan.nextBoolean()
    if (cond == false){
        var limit = Int.MIN_VALUE
        for (i in 0..3){
            if (a[i] > limit){
                limit = a[i]
            }
        }
        print(limit)
    } else {
        var limit = Int.MAX_VALUE
        for (i in 0..3){
            if (a[i] < limit){
                limit = a[i]
            }
        }
        print(limit)
    }
}




