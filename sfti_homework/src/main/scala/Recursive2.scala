/**
 * Created by frank on 1/6/15.
 */
object Recursive2 extends App {

  def power(x: Int, n: Int) {

    if (n == 0) {
      //Use case n = 0
      println(s"ANS: 1")
    } else if (n < 0) {
      //Use case n is negative
      println(s"n is negative")
      loop(n, x)
    } else if (n % 2 == 0) {
      //Use case n is positive and even
      println(s"n is positive and even")
      loop(n, 1)
    } else {
      //Use case n is positive and odd
      println(s"n is positive and odd")
      loop(n, 1)
    }

    //calculate power recursively
    def loop(count: Int, product: Int) {
      println(s"Loop Input => count $count product $product")
      if (count > 0) {
        loop(count - 1, x * product)
      } else {
        println(s"ANS: $product")
      }
    }


  }
  //power(5, 4)

  def power2(x: Double, n: Int) : Double = {

    n match {
      case 0 => 1.0
      case nn if nn < 0 =>
        power2(1.0 / x, nn * -1)
      case nn if nn % 2 == 0 =>
        val y = power2(x, nn / 2)
        y * y
      case _ =>
        x * power2(x, n - 1)
    }
  }
  println(power2(5.0, 3))
}


