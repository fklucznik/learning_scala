package org.s_mach.frank_w_klucznik

/**
 * Created by frank on 1/13/15.
 */
object Chapter3 {

  def question1():Unit = {
    /** Write a code snippet that set a to an array of n random integers between 0
      * inclusive and n exclusive.
      */

    var r = new scala.util.Random
    import scala.collection.mutable._
    val b = new ArrayBuffer[Int]
    b ++= 1 to 10 map {_ => r.nextInt(100)}
  }

}
