object q4 extends App{
  var bank:List[Accts] = List()
  //append accounts to the bank list
  bank = bank :+ new Accts("200022503270",100121,50000)
  bank = bank :+ new Accts("1922235477v",100122,-1000)
  bank = bank :+ new Accts("1936945211v",100123,100000)
  bank = bank :+ new Accts("200046529811",100124,120000)

  println(bank)

  //List of Accounts with negative balances
  val negativeBalance =  bank.filter((x:Accts) => x.balance < 0)
  printf("\nList of Accounts with negative balances : " + negativeBalance)

  //Calculate the sum of all account balances
  val totalBalance:Double = bank.filter((x:Accts) => x.balance != 0).map(bank => bank.balance).reduce((x,y)=>x+y)
  printf("\n\nSum of all account balances : " + totalBalance)

  //Calculate final balances of all accounts after apply the interest
  val totalWithInterest =  bank.map((x:Accts) => if (x.balance>0) x.balance = x.balance * 1.5 else x.balance = x.balance * 1.1)
  printf("\n\nFinal balances with interest : " + bank)

}

class Accts(id:String, ac:Int, b:Double){
  val nic = id
  val accNo = ac
  var balance = b

  //function for withdraw money
  def withdraw(a:Double) = this.balance - a
  //function for deposit money
  def deposit(a:Double) = this.balance + a
  //function for transfer the money between accounts
  def transfer (a:Accts, b:Double) = {
    this.balance = this.balance - b
    a.balance = a.balance + b
  }

  //display the object values
  override def toString = "[ " + nic + " : " + accNo + " : " + balance + " ]"
}
