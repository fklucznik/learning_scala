import scala.util.Random

/**
 * Created by frank on 12/20/14.
 */
object random extends App {

  var myLong = Random.nextLong
  var myBigInt: BigInt = myLong

  val myString = myBigInt.toString(36)

  println(myString)

}
