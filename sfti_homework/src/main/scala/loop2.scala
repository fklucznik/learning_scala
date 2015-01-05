/**
 * Created by frank on 12/22/14.
 */
object loop2 extends App {

  countdown(20)

  def countdown (n:Int) : Unit = {
    var m = n
    while (m > 0) {
      print(m + " ")
      m -= 1
    }
  }
}
