/**
 * Created by frank on 2/15/15.
 */
object Map2 extends App{

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
