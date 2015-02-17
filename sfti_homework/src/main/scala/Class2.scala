/**
 * Write a class time
 * Read-only properties hours and minutes
 * method before(other: Time): Boolean that checks for this time before the other
 * Time object constructed as new Time(hrs, min)
 * hrs is military time between 0 and 23
 */
object Class2 extends App {

  class time (val hrs: Int, val min: Int){
    def before(other: time): Boolean =
      //Is "other" time before this time
      if (other.hrs < hrs || other.hrs == hrs && other.min < min) true else false

  }


  val myTime = new time(scala.util.Random.nextInt(23), scala.util.Random.nextInt(60))

  val yourTime = new time(scala.util.Random.nextInt(23), scala.util.Random.nextInt(60))

  println("MyTime" + myTime.hrs + ":" + myTime.min)
  println("YourTime" + yourTime.hrs + ":" + yourTime.min)
  println("Is YourTime before MyTime?  " + myTime.before(yourTime))

}
