package org.s_mach.frank_w_klucznik

/**
 * Created by frank on 1/20/15.
 */
object Chapter4 {

  def question1():Unit = {
    /**
     * Set up a map of gizmos you covet. Produce a second map w/ the same keys and prices at a 10 discount
     */

    val items = scala.collection.immutable.Map("Car" -> 10000.00, "Computer" -> 1000.00, "TV" -> 3000.00)
    //Print initial map to verify contents
    for ((k,v) <- items) println(k,v)
    //Create new empty map val
    val itemsDiscounted = scala.collection.mutable.Map[String, Double]()
    //Add values
    for ((a,b) <- items) itemsDiscounted += (a -> (b - (b * 0.10)))
    //Print results
    for ((k,v) <- itemsDiscounted) println(k,v)
  }


  def question2():Unit = {
    /**
     *
     */



  }

  def question3():Unit = {
    /**
     *
     */



  }


  def question4():Unit = {
    /**
     *
     */



  }

  def question5():Unit = {
    /**
     *
     */



  }

  def question6():Unit = {
    /**
     *
     */



  }

  def question7():Unit = {
    /**
     *
     */



  }

  def question8():Unit = {
    /**
     *
     */



  }

  def question9():Unit = {
    /**
     *
     */



  }

  def question10():Unit = {
    /**
     *
     */



  }



}
