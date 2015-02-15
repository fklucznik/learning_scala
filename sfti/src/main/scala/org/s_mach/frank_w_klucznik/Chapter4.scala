package org.s_mach.frank_w_klucznik

import java.util.{Calendar, Scanner}

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

    //Create immutable ListMap
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
    import java.util.Calendar

    val days = collection.mutable.LinkedHashMap(
      "SUNDAY" -> Calendar.SUNDAY,
      "MONDAY" -> Calendar.MONDAY,
      "TUESDAY" -> Calendar.TUESDAY,
      "WEDNESDAY" -> Calendar.WEDNESDAY,
      "THURSDAY" -> Calendar.THURSDAY,
      "FRIDAY" -> Calendar.FRIDAY,
      "SATURDAY" -> Calendar.SATURDAY)

    for((a, b) <- days) println(a, b)

  }

  def question7():Unit = {
    /**
     * Print a table of all Java properties, like this.  You ned to find the length of the longest key
     * before you can print the table.
     */

    //Create first map
    var table = scala.collection.mutable.Map[String, String]()
    //Create second map
    var table2 = scala.collection.mutable.Map[String, String]()

    //Add data to map
    table += ("java.runtime.name" -> "Java(TM) SE Runtime Environment",
      "sun.boot.library.path" -> "/home/apps/jdk1.6.0_21/jre/lib/i386",
      "java.vm.version" -> "17.0-b16",
      "java.vm.vendor" -> "Sun Microsystems Inc.",
      "java.vendor.url" -> "http://java.sun.com/",
      "path.separator" -> ":",
      "java.vm.name" -> "Java HotSpot(TM) Server VM")

    //Determine longest key, pad w/ spaces and create a new map
    for((a, b) <- table) {
      table2 += (a.padTo(table.keysIterator.max.length + 3, " ").mkString -> b)
    }

    //Print contents of table
    for((a, b) <- table2) println(s"$a | $b")

  }

  def question8():Unit = {
    /**
     * Write a function minmax(values: Array[Int], v: int) that returns a pair containing
     * the smallest and largest value in an array.
     */

    //Define Array
    val s = Array(1, 4, 23, 65, 2, 32, 87,  66, 7)
    //Sort Array
    val sSorted = s.sortWith(_ < _)


    //Function that takes an Array and returnes the min / max values
    def minmax(values: Array[Int]) : (Int, Int) = {
      val minNumber = values.head
      val maxNumber = values(values.size - 1)
      return (minNumber, maxNumber)
    }
    //Output min and max values
    println(minmax(sSorted))

  }

  def question9():Unit = {
    /**
     *  Write a function lteggt(values: Array[Int], v: int) that returns a triple containing count of
     *  values less than v, equal to v, and greater than v.
     */

    //Define Array
    val s = Array(1, 4, 23, 65, 2, 50, 50, 32, 87,  66, 7)
    //V
    val v = 50


    //Function that takes an Array and an int; and returns the
    //number of values in the Array greater, less and equal to the int
    def minmax(values: Array[Int], v: Int) : (Int, Int, Int) = {
      var lessV = 0
      var greaterV = 0
      var equalV = 0

      for(i <- 0 until values.size)
        if (values(i) == v)
          equalV += 1
        else if (values(i) < v)
          lessV += 1
        else if (values(i) > v)
          greaterV += 1

      return (lessV, equalV, greaterV)
    }
    //Output min and max values
    println(minmax(s, v))

  }

  def question10():Unit = {
    /**
     *  What happens when you zip together two strings, such as "hello".zip("World")?
     *  Come up w a plausible use case.
     */

     //ANS:  The two strings are concatinated together.  Zip is used to map two lists
     //together to form a new list. .

  }



}
