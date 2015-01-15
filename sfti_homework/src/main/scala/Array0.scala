/**
 * Created by frank on 12/20/14.
 */

import scala.collection.mutable._

object Array0 extends App {

  val b = Array(1, 7, 2, 9)
  val bsorted = b.sortWith(_ < _)
  val total = Array(1, 7, 2, 9).sum
  val large = Array(1, 7, 2, 9).max
  val small = Array(1, 7, 2, 9).min
  val question = 10 max 2
  var count = 3

    println(total, large, small, question)

    println(b(count), b(count - 1), b(count - 2), b(count - 3))

    println(bsorted(count), bsorted(count - 1), bsorted(count - 2), bsorted(count - 3))
}
