import java.util.Scanner
import java.io._

object Maps extends App {

  /**
   * Write a program that reads words from a file.  Use mutable map to count how often
   * each word appears.
   */


  val in = new Scanner(java.io.File("myfile.text"))
  while (in.hasNext()) println(in.next())


  /**
  val items = scala.collection.immutable.Map("Car" -> 10000.00, "Computer" -> 1000.00, "TV" -> 3000.00)
  //Print initial map to verify contents
  for ((k,v) <- items) println(k,v)
  //Create new empty map val
  val itemsDiscounted = scala.collection.mutable.Map[String, Double]()
  //Add values
  for ((a,b) <- items) itemsDiscounted += (a -> (b - (b * 0.10)))
  //Print results
  for ((k,v) <- itemsDiscounted) println(k,v)
    */
}
