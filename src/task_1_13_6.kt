
fun main(args: Array<String>){
    var eat = scan.nextInt()
    var eat_cost = scan.nextInt()
    var day_cost = scan.nextInt()
    var way_cost = scan.nextInt()
    var days = scan.nextInt()
    var sale = scan.nextInt()
    print(eat * eat_cost * days + day_cost * days + way_cost * 2 - sale)
}




