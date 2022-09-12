object q1 extends App {
    val obj1 = new Rational(2,4)
    val obj2 = new Rational(4,5)
    println(obj1.neg)
    val q = obj1.add(obj2)
    println(q)
}

class Rational(n:Int, d:Int) {
    require(d>0, "Denominator must be positive")
    
    private def gcd(a: Int, b: Int): Int = {
        if(b == 0) a 
        else gcd(b, a%b)
    }    

    private val g = gcd(n, d)  
    if(g < 0) -g else g    

    def numer = n/g
    def denom = d/g

    def add(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}