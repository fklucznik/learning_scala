/**
 * Created by frank on 12/22/14.
 */
object loop extends App{
  /** Java algorithm:  for (int i = 10; i >= 0; i--) System.out.println(i);
    * Scala While loop equivalent
    */
  var n: Int = 10
  while (n > 0) {
    print(n + " ")
    n -= 1
  }
  //line feed
  print("\n")

  //Scala for loop equivalent
  var sum = 10
  for (i <- 1 to 10) {
    print(sum + " ")
    sum -= 1
  }
  //line feed
  print("\n")

  //Did this to see iteration w/ character string; pretty cool
  sum = 10
  for (ch <- "Hello") {
    sum += ch
    print(sum + " " + ch + "\n")
  }
}
