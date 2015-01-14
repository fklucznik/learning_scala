/**
 * Created by frank on 1/6/15.
 */
object Recursive2 extends App {

  def power(x: Double, n: Int) : Double = {

    if (n == 0) {
      //Use case n = 0
         1.0
    } else if (n < 0) {
      //Use case n is negative
         power(1.0 / x, n * -1)

    } else if (n % 2 == 0) {
      //Use case n is positive and even
         val y = power(x, n / 2)
         y * y
    } else {
      //Use case n is positive and odd
         x * power(x, n - 1)
    }
  }
  println(power(5.0, -4))
/**
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
  //println(power2(5.0, 3)) */
}


