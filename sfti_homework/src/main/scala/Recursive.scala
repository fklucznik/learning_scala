/**
 * Created by frank on 12/22/14.
 */
object Recursive extends App {

  def product(ch: String): Int = {
    def loop(index: Int, product: Int): Int = {
      println(s"Loop => index=$index product=$product")
      if (index <= ch.indices.last) {
        val tmp = ch.charAt(index).toInt
        loop(index + 1, tmp * product)
      } else {
        product
      }
    }

    loop(0, 1)

  }

  println(product ("frank"))


}
