/**
 * Created by frank on 1/15/15.
 */
import scala.collection._
object Array1 extends App {

var a = Array(66,67,68,69,70,71,72,73,74,80)

 for (x <- a) {
   println(x)
 }

val result = for (count <- 0 until (a.size, 2)) yield
{if ((count + 1) < a.size) (a(count + 1), a(count)) else a(count)}

  for (x <- result) {
    println(x)
  }
}
