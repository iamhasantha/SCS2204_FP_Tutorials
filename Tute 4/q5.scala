object q5 {
  def toUpper(txt: String): String = {
    txt.toUpperCase()
  }

  def toLower(txt: String): String = {
    txt.toLowerCase()
  }

  def formatNames(name: String)(caseFunc: String => String) = {
    caseFunc(name)
  }

  def main(args: Array[String])={
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(s"${formatNames(name1)(toUpper(_))}")
    println(s"${formatNames(name2.substring(0,2))(toUpper(_))}${name2.substring(2)}")
    println(s"${formatNames(name3)(toLower(_))}")
    println(s"${formatNames(name4.substring(0,1))(toUpper(_))}${name4.substring(1,4)}${formatNames(name4.substring(4,5))(toUpper(_))}")
  }

}
