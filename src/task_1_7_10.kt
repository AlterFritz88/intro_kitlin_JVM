
fun main(args: Array<String>){
    val st = scan.nextLine()
    for (i in 0..(st.length-1)){
        if (i == 1) print('F')
        else if (i == st.length-2) print('L')
        else print(st[i])
    }
}