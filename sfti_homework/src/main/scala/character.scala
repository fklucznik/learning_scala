/**
 * Created by frank on 12/22/14.
 */
object character extends App {

  var x = 1
  for (c <- "Hello") x *= c.toInt
  print(x)

}
