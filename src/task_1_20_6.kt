import java.util.*


fun main(args: Array<String>){
    var init = scan.nextInt()
    var minus = 0
    while (scan.hasNext()){
        minus = scan.nextInt()

        if ((init - minus) < 0) {
            println("Ошибка, недостаточно средств для списания. Баланс - ${init} руб, нужно - ${minus} руб")
            return
        }
        init -= minus
    }
    println("Благодарим за то, что вы пользуетесь услугами нашей компании! Баланс - ${init} руб")
}