
fun main(args: Array<String>) {
val a: String? = null
val b: String? = "test"
val c: String = "cats"

val d = (a?.toLowerCase() ?: b) ?: "dogs".toUpperCase()
val e = (d ?: c)?.capitalize() ?: null
    println(d)
println(e)
}