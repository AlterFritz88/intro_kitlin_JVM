
fun main(args: Array<String>){
    val n = scan.next().toInt()
    val n1 = n % 10 * 1000
    val n2 = n / 10 % 10 * 100
    val n3 = n / 100 % 10 * 10
    val n4 = n / 1000 % 10 * 1
    print(n1 + n2 + n3 + n4)
}