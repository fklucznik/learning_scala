import java.util.TimeZone

/**
 * Created by frank on 1/19/15.
 */
object Timezone extends App {

  var AvailableIds: Array[String] = TimeZone.getAvailableIDs()

  //Capture index of all items in list "America/" prefix in order
  var Indexes = for(i <- 0 until AvailableIds.size if (AvailableIds(i).startsWith("America/"))) yield {i}


  for(i <- 0 until Indexes.size){
    println(AvailableIds(Indexes(i)))
  }

}
