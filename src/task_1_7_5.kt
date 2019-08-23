
fun main(args: Array<String>){
    val n1 = scan.next().toInt()
    val n2 = scan.next().toInt()
    print("${n1 / 100 + n1 % 10 + n2 / 100 + n2 % 10}")
}