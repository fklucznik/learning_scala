/**
 * Created by frank on 12/22/14.
 */
object String3 extends App{

  def product (ch:String) : Int = {
    ch.map(_.toInt).product
    }

  print(product("Hello"))

}
