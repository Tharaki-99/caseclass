object caseclassproblem extends App{

  case class Point(x:Int,y:Int){
    def +(that:Point) = Point(this.x+that.x, this.y+that.y)

    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

    def distant(that:Point) ={
      math.sqrt(math.pow((this.x - that.x), 2) + math.pow((this.y - that.y), 2))
    }

    def invert() =Point(this.y,this.x)
  }

  val p1 = Point(3,2);
  val p2 = Point(-5,4);

  println(p1);
  println(p2);
  println("");

  println("Addition of " + p1 + " and " + p2 + ": " + (p1+p2));
  println("");

  println("Move " + p2 + " by (10,12) :" + p2.move(10,12));
  println("");

  println("Distance between " + p1 + " and " + p2 + ": " + p2.distant(p1));
  println("");

  println("Inverse of " + p2 + ": " + p2.invert());
  println("");


}
