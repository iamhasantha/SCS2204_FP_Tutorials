class Rational(x: Int, y: Int) {
    private def gcd(a: Int, b: Int): Int = {
        if(b == 0) a 
        else gcd(b, a%b)
    }          
    private  val g = gcd(x , y)
    def numer = x/g
    def denom = y/g

    def add(r: Rational) = new Rational(numer * r.denom + r.numer * denom, denom * r.denom)

    def neg = new Rational(-this.numer, this.denom)

    override def toString(): String = numer + "/" + denom
}