import java.util.TimeZone

/**
 * Created by frank on 1/19/15.
 */
object Timezone extends App {
  //Get available timezone IDs
  var AvailableIds: Array[String] = TimeZone.getAvailableIDs()

  //Capture index of all items in list "America/" prefix in order
  var Indexes: IndexedSeq[Int] = for(i <- 0 until AvailableIds.size if (AvailableIds(i).startsWith("America/"))) yield {i}

  //Output list before stripping prefix
  for(i <- 0 until Indexes.size) {
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
