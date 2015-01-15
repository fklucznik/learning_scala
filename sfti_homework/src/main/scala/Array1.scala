/**
 * Created by frank on 1/15/15.
 */
object Array1 extends App {

var a = Array(66,67,68,69,70,71,72,73)

 for (x <- a) {
    println(x)
  }

 var count = 0
  for (count <- 0 until (a.size, 2)) {


    if ((count + 1) < a.size) {

      //Save Array Values
      val first = a(count)
      val second = a(count + 1)
      //Reassign Values
      a(count) = second
      a(count + 1) = first

    }

  }

  for (x <- a) {
    println(x)
  }
}
