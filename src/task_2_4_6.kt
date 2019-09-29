enum class StoreStatus {
    OK, ALREADY_STORED, DENY
}
interface Storable {
    fun canStore() : StoreStatus
    fun store() : String
    fun unstore()
}
abstract class Transaction(var sum: Int, var number: Int) {
    abstract fun process() : String
}

class StorableTransaction(sum: Int, number: Int) : Storable, Transaction(sum, number){
    var is_proc = false
    var is_store = false
    override fun process(): String {
        this.is_proc = true
        return "Processing transaction #${this.number} (${this.sum}$)"
    }
    override fun canStore(): StoreStatus{
        if (this.is_store == true) return StoreStatus.ALREADY_STORED
        else if (this.is_proc == true) return StoreStatus.DENY
        else return StoreStatus.OK
    }
    override fun store() : String{
        this.is_store = true
        return "Transaction (number=${this.number}, sum=${this.sum})"
    }
    override fun unstore(){
        this.is_proc = false
        this.is_store = false
    }
}





fun main(args: Array<String>) {
    val st = StorableTransaction(100,2)
    println(st.process())                //Processing transaction #2 (100$)
    println(st.canStore())               //DENY
    println(st.store())                  //Transaction (number=2, sum=100)
    println(st.canStore())               //ALREADY_STORED
    st.unstore()
    println(st.canStore())               //OK
    val st1 = StorableTransaction(400,5)
    println(st1.process())               //Processing transaction #5 (400$)
    println(st1.canStore())              //DENY
    println(st.canStore())               //OK

}