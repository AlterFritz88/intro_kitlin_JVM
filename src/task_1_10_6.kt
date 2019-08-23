
fun main(args: Array<String>){
    var st = scan.nextLine().toString()
    for (i in 0..st.length-1){
        if (i % 2 == 0) print(st[i].toUpperCase())
        else print(st[i].toLowerCase())
    }
}