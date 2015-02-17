/**
 * Created by frank on 2/17/15.
 */
object Class1 extends App{


  class Network{
    class Member(val name: String) {
      val contacts = new scala.collection.mutable.ArrayBuffer[Member]
      override def toString = name
    }

    val members = new scala.collection.mutable.ArrayBuffer[Member]

      def join(name: String) = {
        val m = new Member(name)
        members += m
        m
      }

  }


  val chatter = new Network

    chatter.join("Karla")
    chatter.join("Mike")
    chatter.join("John")

/**
    for(i <- 0 until chatter.members.size) {
      println(chatter.members(i))
    //println(chatter.members.mkString("x"))
    }
 */

  for(m <- chatter.members) {
    println(m)
  }



}
