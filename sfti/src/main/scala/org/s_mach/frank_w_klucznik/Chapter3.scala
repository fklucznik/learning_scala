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

  def question2() :Unit = {

    // Write a loop that swaps adjacent elements of an array of integers

    var a = Array(66,67,68,69,70,71,72,73)

    for (x <- a) {
      println(x)
    }

    var count = 0
    for (count <- 0 until (a.size, 2)) {


      if ((count + 1) < a.size) {

        //Save Array Values
        val first = a(count)
        val second = a(count + 1)
        //Reassign Values
        a(count) = second
        a(count + 1) = first

      }

    }

    for (x <- a) {
      println(x)
    }
  }

  def question3() :Unit = {

    // Write a loop that swaps adjacent elements of an array of integers
    // Use for/yield

    import scala.collection._
    object Array1 extends App {

      var a = Array(66,67,68,69,70,71,72,73,74,80)

      for (x <- a) {
        println(x)
      }

      val result = for (count <- 0 until (a.size, 2)) yield
      {if ((count + 1) < a.size) (a(count + 1), a(count)) else a(count)}

      for (x <- result) {
        println(x)
      }
    }
  }
}
