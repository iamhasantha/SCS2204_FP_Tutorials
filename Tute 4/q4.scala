object q4 {
  def matchInt(x:Int): String = {
    x match {
        case x if x <= 0 => "Negative/Zero"
        case x if x % 2 == 0 => "Even"
        case x if x % 2 != 0 => "odd"
    }        
  }

  def main(args: Array[String]) = {
    print("Enter the Integer: ")
    val input = scala.io.StdIn.readInt() 

    println(s"The integer $input : ${matchInt(input)}")
  }
}
