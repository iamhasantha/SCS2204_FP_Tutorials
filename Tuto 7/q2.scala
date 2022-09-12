object q2 extends App {
    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)
  
    val a = x-y-z
    
    println(a)
}

class Rational(n:Int, d:Int) {
    require(d>0, "Denominator must be positive")

    def numer = n
    def denom = d

    def add(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def neg = new Rational(-this.numer, this.denom)
    def -(r:Rational) = this.add(r.neg)
    override def toString(): String = numer + "/" + denom
}