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
  power(5, 4)
}


