/**
 * Created by frank on 2/15/15.
 */
object Map3 extends App {
  //Define Array
  val s = Array(1, 4, 23, 65, 2, 50, 50, 32, 87,  66, 7)
  //V
  val v = 50


  //Function that takes an Array and an int; and returns the
  //number of values in the Array greater, less and equal to the int
  def minmax(values: Array[Int], v: Int) : (Int, Int, Int) = {
    var lessV = 0
    var greaterV = 0
    var equalV = 0

    for(i <- 0 until values.size)
      if (values(i) == v)
         equalV += 1
    else if (values(i) < v)
         lessV += 1
    else if (values(i) > v)
         greaterV += 1

    return (lessV, equalV, greaterV)
  }
  //Output min and max values
  println(minmax(s, v))


}
