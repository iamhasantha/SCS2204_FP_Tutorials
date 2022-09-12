object q3 extends App{
    var acc1 = new Account("1", 1, 500)
    var acc2 = new Account("2", 2, 800)
    var acc3 = new Account("3", 3, 250)

    acc2.transfer(acc1, 400)
    acc1.transfer(acc3, 200)

    println(acc1)
    println(acc2)
    println(acc3)

}


class Account(id: String, n: Int, bal: Double ) {
    val nic: String = id
    val accNo: Int = n
    var balance: Double = bal    

    def withdraw(amount: Double) = { this.balance = this.balance - amount }

    def deposit(amount: Double) = { this.balance = this.balance + amount }

    def transfer(a: Account, b: Double) = {
        a.balance = a.balance + b
        this.balance = this.balance - b

        println(s"Rs$b transfered from ${this.accNo} to ${a.accNo}")
    }

    override def toString = "[ NIC "+nic+": AccountNo "+accNo +": Rs"+ balance+"]"
}