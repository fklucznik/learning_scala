/**
 * Created by frank on 1/6/15.
 */
object Recursive2 extends App {

  def power(x: Double, n: Double): Double = {

    //calculate power recursively
    def loop(count: Double, product: Double): Double = {

      println(s"Loop => count=$count x=$x")

      if (count > 0) {
        loop(count - 1, x * product)
      } else {
        product
      }
    }
    //initiate loop
    loop(n,1)

    //need to add use cases
    //account for negative n


  }

  println(power(5.0,-4.0))








}
