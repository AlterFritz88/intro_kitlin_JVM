import java.util.*


fun main(args: Array<String>){
    var max = Int.MIN_VALUE
    var a = 0;
    var pos = 1;
    var max_pos = 1;
    while(scan.hasNext()){
        a = scan.nextInt()
        if (a > max) {
            max = a
            max_pos = pos;
        }
        pos++;
    }
    print("${max} ${max_pos}")
}