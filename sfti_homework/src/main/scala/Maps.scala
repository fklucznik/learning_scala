//import scala.io.Source
import scala.collection.immutable._
import java.io._
import java.util._
import scala.collection.mutable.ArrayBuffer
import scala.collection.immutable.ListMap
import java.util.TreeMap



object Maps extends App {

  /**
   * Write to a file
   */
  /**
    val writer = new PrintWriter(new File("/home/frank/sbt/learning_scala/file_operation/test3.txt" ))
    writer.write("Hello Scala")
    writer.close()
    **/

  /**
   * Read from a file
   */
  /**
  println("Following is the content read:" )

  Source.fromFile("/home/frank/sbt/learning_scala/file_operation/test.txt" ).foreach{
    print
  }
    */

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
  //var words = TreeMap[String, Integer]()
  var words = scala.collection.immutable.Map[String, Int]()

  //Map unique strings and count
  words = mapped.groupBy(l => l).map(t => (t._1, t._2.length))

  //
  var finalWord = scala.collection.immutable.ListMap[String,Int]()

  //Sort map by words
  //finalWord = ListMap(words.toSeq.sortBy(_._1) :_*)

  //Sort map by count
  finalWord = ListMap(words.toSeq.sortBy(_._2) :_*)

  //Verify contents of map
  for ((a,b) <- finalWord) println(a,b)

}
