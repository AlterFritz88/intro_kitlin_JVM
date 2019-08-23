import kotlin.math.min
import kotlin.math.max


fun main(args: Array<String>){
    var a = scan.nextInt()
    var b = scan.nextInt()
    if ((a + b) % 2 == 0){
        print(min(a, b))
    } else print(max(a, b))
}
