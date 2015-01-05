/**
 * Created by frank on 12/20/14.
 */
object exponent extends App {
  var x: BigInt = 2
  var count: Int = 9

  while (count > 0){
    x = x * 2
    count -= 1
  }

  var y: Double = Math.pow(2,10)

  println(y,x)
}
