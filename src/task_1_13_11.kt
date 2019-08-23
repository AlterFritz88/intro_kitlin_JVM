fun main(args: Array<String>){
    val A = scan.nextInt()
    val B = scan.nextDouble()
    when {
        (A == 1) -> print(Math.pow(B, B))
        (A == 2) -> print(B.toInt())
        (A == 3) -> print(Math.ceil(B).toInt())
        (A == 4) -> print(Math.round(B).toInt())
        (A == 5) -> print(Math.abs(B))
        (A == 6) -> print(Math.sqrt(B))
        else -> print(2 * B * B)
    }
}
