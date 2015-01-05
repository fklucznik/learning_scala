/**
 * Created by frank on 12/22/14.
 */
object Recursive extends App {

  def r(acc: Int, s : String) : Int = {
    s match {
      case "" => acc
      case _ => r(s.head.toInt * acc, s.tail)
    }
  }

  println(r(1, "Hello"))
 }
