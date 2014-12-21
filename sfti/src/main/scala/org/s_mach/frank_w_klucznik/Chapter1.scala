package org.s_mach.frank_w_klucznik

/**
 * Created by frank on 12/20/14.
 */
object Chapter1 {

  def question1():Unit = {
    //Did not understand this question at all. Could not get "type 3" to tell me anything.
    //Let's discuss.
  }

  def question2():Unit = {
    /** My code to calculate the sqrt.
      * Output: (The sqrt of 3.0 is 1.7320508100147274. 1.7320508100147274 squared = 3.0000000084726732.)
      * Does not matter does not change after 4 iterations b/c of limitations in using a Double
      * One point of discussion:  Res variables are your friend
      */

    object sqrt extends App {
      def x: Double = 3.0
      def y: Double = 2.0
      var count: Int = 2

      //initial guess
      var g = x / y
      //initial average
      var w = (g + y) / 2

      while (count > 0) {
        //next guess
        g = x / w
        //next average
        w = (g + w) / 2

        count = count - 1
      }

      //Result Validation
      g = w * w

      Console.println("The sqrt of " + x + " is " + w + ". " + w + " squared = " + g + ".")
    }
  }

  def question3():Unit = {
    /** Val.  I added two integers together to produce "res1". Then tried to reassign res1 = 3+5.
      * This returned error stating res is  val.
      */
  }

  def question4():Unit = {
    /** "crazy" * 3 = res1: String = crazycrazycrazy
      */
  }

  def question5():Unit = {
    /** 10 max 2 returns the larger of the two values. Min/Max are often used w/
      * arrays and apply to strings as well as numbers.
      * Some code I played w/ below.
      * Output was as follows:
      * (19,9,1,20)
      * (9,2,7,1)
      * (9,7,2,1)
      */

    object array extends App {
      val b = Array(1, 7, 2, 9)
      val bsorted = b.sortWith(_ < _)
      val total = Array(1, 7, 2, 9).sum
      val large = Array(1, 7, 2, 9).max
      val small = Array(1, 7, 2, 9).min
      val question = 10 max 2
      var count = 3

      println(total, large, small, question)

      println(b(count), b(count - 1), b(count - 2), b(count - 3))

      println(bsorted(count), bsorted(count - 1), bsorted(count - 2), bsorted(count - 3))
    }

  def question6():Unit = {
      /** Math.pow() uses and return doubles. Wrote my own function using BigInt
        * Code below. Verified it was correct comparing my code w/ Math.pow(2,10)
        * Output: 179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216
        */

      object exponent extends App {
        var x: BigInt = 2
        var count: Int = 1023

        while (count > 0){
          x = x * 2
          count -= 1
        }

        println(x)
      }
    }

  def question7():Unit = {
      /** Singleton random number generator from the scala.util package
        * Output is a random string such as:  wkymjmlbkiew
        */
    }
  }

  def question8():Unit = {
    /** Got it...code below.
      */

    import scala.util.Random

    /**
     * Created by frank on 12/20/14.
     */
    object random extends App {

      var myLong = Random.nextLong
      var myBigInt: BigInt = myLong

      val myString = myBigInt.toString(36)

      println(myString)

    }
  }

  def question9():Unit = {
    /** Code below.
      * Output:
      * Elizabeth River Tunnels
      * 23
      * The first character in the string is E
      * The last character in the string is s
      */

    object string extends App {
      val stringVal = "Elizabeth River Tunnels"
      var len = stringVal.length()

      println(stringVal)
      println(len)
      println("The first character in the string is " +  stringVal(0))
      println("The last character in the string is " + stringVal(len-1))
    }

  }

  def question10():Unit = {
    /**
     *
      *drop(n): Selects all elements except the first n ones.
     * dropRight(n): Selects all elements except last n ones.
     * take(n): Selects the first n elements.
     * takeRight(n): Selects the last n elements
     *
     * Substring is a builder for mutable sequence of characters. The class provides
     * API mostly compatible w/ java.lang.StringBuilder.
     *
     * Drop, Take, etc. are all in the list class for immutable linked lists representing
     * ordered collections of elements of type. These functions do not have any designed
     * compatibility w/ Java. Suspect they extend or compliment the Jave substring functions.
      */
  }
}




