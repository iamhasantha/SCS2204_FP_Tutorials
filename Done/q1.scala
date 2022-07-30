object test{
    def interest(amount: Double): Double = {
        amount match{
            case amount if amount < 20000.00 => amount * 0.02;
            case amount if amount < 200000.00 => amount * 0.035;
            case amount if amount < 2000000.00 => amount * 0.04;
            case amount if amount > 2000000.00 => amount * 0.065;
        }
    }

    def main(args: Array[String])= {
        print("Enter the Deposit: ")
        val input = scala.io.StdIn.readDouble()

        println(s"annual interest: ${interest(input)}")
  }
}