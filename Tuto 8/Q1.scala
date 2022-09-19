trait operators {
  def +(p:Point):Point
}

case class Point(a:Int, b:Int) extends operators {
    def x:Int = a
    def y:Int = b

    override def +(p:Point)=Point(x+p.x,y+p.y)

    def move(dx:Int, dy:Int) = Point(x+dx, y+dy)

    def distance(q:Point):Double = Math.sqrt(Math.pow(q.x - x, 2) + Math.pow(q.y - y, 2))

    def invert() = Point(this.y,this.x)

}


object main extends App {
    val p1 = Point(1, 2)
    val p2 = Point(2, 2)

    println(p1+p2)
    println(p2.move(-1,2))
    println(p1.distance(p2))

    print(p1.invert())
}