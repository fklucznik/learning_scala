import scala.collection.mutable.ArrayBuffer

/**
 * Created by frank on 1/15/15.
 */

object Array1 extends App {

  var a = ArrayBuffer(66,-67,68,-9,70,71,-72,73,-74,80)

  var negIndexes = for(i <- 0 until a.size if (a(i) <= 0)) yield i

  negIndexes = negIndexes.reverse

  negIndexes = negIndexes.drop(negIndexes.size -1)

  a(0) = a(negIndexes(0))

  a.trimEnd(a.size - 1)

  for (x <- a) {
    println(x)
  }


}
