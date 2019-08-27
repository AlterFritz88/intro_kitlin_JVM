import java.util.*


fun main(args: Array<String>){
    var sum = scan.nextInt()
    var znak = ""
    while(scan.hasNext()){
        znak = scan.next()
        if (znak[0] == '+'){
            var value = (znak.subSequence(1..znak.length-1)).toString().toInt()
            sum += value
        }
        else {
            var value = (znak.subSequence(1..znak.length-1)).toString().toInt()
            if (sum - value < 0){
                print("Ошибка, недостаточно средств для списания. Баланс - ${sum} руб, нужно - ${value} руб")
                return
            } else {
                sum -= value
            }
        }

    }
    print("Благодарим за то, что вы пользуетесь услугами нашей компании! Баланс - ${sum} руб")
}