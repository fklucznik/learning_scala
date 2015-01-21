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

    //Generate array
    var a = Array(66,67,68,69,70,71,72,73)

    //Loop
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
    //Display results
    for (x <- a) {
      println(x)
    }
  }

  def question3() :Unit = {

    // Write a loop that swaps adjacent elements of an array of integers
    // Use for/yield

    //Generate array
    val a = Array(66,67,68,69,70,71,72,73,74,80)

    //Generate indexed sequence of arrays
    val result: IndexedSeq[Array[Int]] = for (count <- 0 until (a.size, 2)) yield
    {if ((count + 1) < a.size) Array(a(count + 1), a(count)) else Array(a(count))}

    //Flatten the indexed sequence
    val result2: IndexedSeq[Int] = result.flatten

    //Convert indexed sequence to an array for the correct answer
    val answer: Array[Int] = result2.toArray
  }

  def question4() :Unit = {
    //Produce a new array containing all positive values in their original order,
    //followed by all values zero or negative in their original order

    //Generate Array
    val a = Array(66,-67,68,-9,70,71,-72,73,-74,80)

    //Save positive indexes
    val posIndexes = for(i <- 0 until a.size if (a(i) > 0)) yield {
      i
    }

    //Save negative indexes
    val negIndexes = for(i <- 0 until a.size if (a(i) <= 0)) yield {
      i
    }
    //Create a new array
    var b = new Array[Int](a.size)


    //Add positive numbers to new array
    for (i <- 0 until posIndexes.size) b(i) = a(posIndexes(i))

    //Add negative numbers to new array
    for (j <- 0 until negIndexes.size) b(posIndexes.size + j) = a(negIndexes(j))

  }


  def question5() :Unit = {
    //How do you computer the average of an Array[Double]?

    val a = Array(66.6, 77.7, 22.0, -44.4, 29.2)

    a.sum/(a.size +1)

  }


  def   question6() :Unit = {
    //How do you rearrange the elements of an Array[Int] so they appear in reverse sorted order?
    //How do you do the same w/ an ArrayBuffer[Int]?


    val a = Array(66.6, 77.7, 22.0, -44.4, 29.2)
    val b = a.reverse

    import scala.collection.mutable.ArrayBuffer
    val a = ArrayBuffer(66, 77, 22, -44, 29, 0)

    val b = a.reverse

  }

  def question7() :Unit = {
    //Write a code snippet that produces all values from an array w/ duplicates removed

    var a = Array(66,67,68,69,70,71,72,72,73,74,80)
    a.distinct

  }

  def question8() :Unit = {
    /** Rewrite the example at the end of Section 3.4.
      * Collect the indexes of the negative elements. reverse the sequence, drop the last
      * last index, and call a.remove(i) for each index.  Compare the efficiency of this
      * approach with the two approaches in Section 3.4.
      */
    import scala.collection.mutable.ArrayBuffer

    //Generate ArrayBuffer
    var a = ArrayBuffer(66,-67,68,-9,70,71,-72,73,-74,80)

    //Capture index of all negative numbers in order
    var negIndexes = for(i <- 0 until a.size if (a(i) <= 0)) yield i

    //Reverse the index of negative numbers; not sure why...not needed.
    //The index we are interested in is negIndexes(0)
    negIndexes = negIndexes.reverse

    //Remove all negative number indexes except the one of interest
    negIndexes = negIndexes.drop(negIndexes.size -1)

    //Move the first negative number in the sequence to the head
    a(0) = a(negIndexes(0))

    //Delete all other values in the ArrayBuffer except the first negative number
    a.trimEnd(a.size - 1)

    //Print result
    for (x <- a) {
      println(x)
    }

    //Less looping in this code. More efficient.


  }

  def  question9() :Unit = {
    /** Make a collection of all timezones that are in America
      * Strip off the "America/" prefix ans sort the result
      */
    import java.util.TimeZone

    object Timezone {
      //Get available timezone IDs
      var AvailableIds: Array[String] = TimeZone.getAvailableIDs()

      //Capture index of all items in list "America/" prefix in order
      var Indexes: IndexedSeq[Int] = for (i <- 0 until AvailableIds.size if (AvailableIds(i).startsWith("America/"))) yield {
        i
      }

      //Output list before stripping prefix
      for (i <- 0 until Indexes.size) {
        println(AvailableIds(Indexes(i)))
      }

      //Strip prefix "America/"
      var Result: IndexedSeq[String] = for(i <- 0 until Indexes.size) yield { AvailableIds(Indexes(i)).stripPrefix("America/")}

      //Sort the list
      Result = Result.sorted

      //Display resulting list
      for(x <- Result){
        println(x)
      }

    }
  }

  def question10() :Unit = {
    /** Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with
      * the call val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
      * Then call the getNativesForFalvor method with parameter DataFlavor.imageFlavor and get teh
      * return value as a Scala buffer.
       */

    import java.awt.datatransfer._
    import collection.mutable.Buffer
    import scala.collection.JavaConversions._

    /**
     * Created by frank on 1/20/15.
     */
    object FlavorMap extends App {

      val flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]

      val natives: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

      println(natives)

    }


  }
}
