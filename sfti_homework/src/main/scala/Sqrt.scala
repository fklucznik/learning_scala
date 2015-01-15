/**
 * Created by frank on 12/20/14.
 */
object Sqrt extends App {
  def x: Double = 3.0
  def y: Double = 2.0
  var count: Int = 2

  //initial guess
  var g = x / y
  //initial average
  var w = (g + y) / 2

  while (count > 0) {
      //next guess
      g = x / w
      //next average
      w = (g + w) / 2

      count = count - 1
  }

  //Result Validation
  g = w * w

  Console.println("The sqrt of " + x + " is " + w + ". " + w + " squared = " + g + ".")
}
