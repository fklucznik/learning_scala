/**
 * Created by frank on 2/8/15.
 */
import java.util.Calendar

object Map1 extends App {

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