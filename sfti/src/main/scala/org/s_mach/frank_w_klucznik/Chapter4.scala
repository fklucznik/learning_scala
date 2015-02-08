package org.s_mach.frank_w_klucznik

import _root_.java.io.File
import _root_.java.io.File
import _root_.java.util.Scanner
import _root_.java.util.Scanner

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
     *Write a program that reads words from a file. Use a mutable map. Count how often each word appears.
     * Print out each word and their counts
     */
    import scala.collection.mutable._
    import java.io._
    import java.util._

    //Create file object as input to Scanner
    val file = new File("/home/frank/sbt/learning_scala/file_operation/test.txt")

    //Create a array buffer to store text for processing
    val temp = ArrayBuffer[String]()

    //Create file iterator
    val in = new Scanner(file)

    //Read file into ArrayBuffer
    while (in.hasNext())  temp += (in.next)

    //Convert ArrayBuffer to Seq for mapping
    val mapped = temp.toSeq

    //Create mutable map
    //val words = new scala.collection.mutable.Map[String, Int]()

    //Map unique strings and count
    val words = mapped.groupBy(l => l).map(t => (t._1, t._2.length))

    //Verify contents of map
    for ((a,b) <- words) println(a,b)

  }

  def question3():Unit = {
    /**
     *Answer question 2 using an immutable Map
     */

    import java.io._
    import java.util._
    import scala.collection.mutable.ArrayBuffer

    //Create file object as input to Scanner
    val file = new File("/home/frank/sbt/learning_scala/file_operation/test.txt")

    //Create a array buffer to store text for processing
    val temp = ArrayBuffer[String]()

    //Create file iterator
    val in = new Scanner(file)

    //Read file into ArrayBuffer
    while (in.hasNext())  temp += (in.next)

    //Convert ArrayBuffer to Seq for mapping
    val mapped = temp.toSeq

    //Create mutable map
    var words = scala.collection.immutable.Map[String, Int]()

    //Map unique strings and count
    words = mapped.groupBy(l => l).map(t => (t._1, t._2.length))

    //Verify contents of map
    for ((a,b) <- words) println(a,b)

  }


  def question4():Unit = {
    /**
     *  Same thing but sort words by alpha
     */

    import scala.collection.immutable._
    import java.io._
    import java.util._
    import scala.collection.mutable.ArrayBuffer
    import scala.collection.immutable.ListMap

    //Create file object as input to Scanner
    val file = new File("/home/frank/sbt/learning_scala/file_operation/test.txt")

    //Create a array buffer to store text for processing
    val temp = ArrayBuffer[String]()

    //Create file iterator
    val in = new Scanner(file)

    //Read file into ArrayBuffer
    while (in.hasNext())  temp += (in.next)

    //Convert ArrayBuffer to Seq for mapping
    val mapped = temp.toSeq

    //Create mutable map
    var words = scala.collection.immutable.Map[String, Int]()

    //Map unique strings and count
    words = mapped.groupBy(l => l).map(t => (t._1, t._2.length))

    //
    var finalWord = scala.collection.immutable.ListMap[String,Int]()

    //Sort map by words
    finalWord = ListMap(words.toSeq.sortBy(_._1) :_*)

    //Sort map by count
    //finalWord = ListMap(words.toSeq.sortBy(_._2) :_*)


    //Verify contents of map
    for ((a,b) <- finalWord) println(a,b)

  }

  def question5():Unit = {
    /**
     * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
     *
     * Looked into this and was able to get the words into a Java TreeMap...but producing the
     * groupBy mapping was to complex in Java. Found several examples...none were simple enough
     * to try to incorporate into the program above.
     */



  }

  def question6():Unit = {
    /**
     * Define a linked hash map that maps "Monday" to java.util.Calendar.Monday. Do same for other
     * weekdays.  Demonstrate that all elements are visited in insertion order.
     */



  }

  def question7():Unit = {
    /**
     * Print a table of all Java properties, like this.  You ned to find the length of the longest key
     * before you can print the table.
     */



  }

  def question8():Unit = {
    /**
     * Write a function minmax(values: Array[Int], v: int) that returns a pair containing
     * the smallest and largest value in an array.
     */



  }

  def question9():Unit = {
    /**
     *  Write a function lteggt(values: Array[Int], v: int) that returns a triple containing count of
     *  values less than v, equal to v, and greater than v.
     */



  }

  def question10():Unit = {
    /**
     *  What happens when you zip together two strings, such as "hello".zip("World")?
     *  Come up w a plausible use case.
     */



  }



}
