


fun main(args: Array<String>){
    var mama = scan.nextInt()
    var papa = scan.nextInt()
    var persons = scan.nextInt()
    var cost = 100000
    when ((mama + papa) / persons){
        in 20000..Int.MAX_VALUE -> print(0)
        in 0..9999 -> print(cost / 2)
        in 10000..11999 -> print((cost * 0.4).toInt())
        in 12000..15999 -> print((cost * 0.3).toInt())
        in 16000..17999 -> print((cost * 0.2).toInt())
        in 18000..19999 -> print((cost * 0.1).toInt())
    }
}




