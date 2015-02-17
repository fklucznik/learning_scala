package org.s_mach.frank_w_klucznik

/**
 * Created by frank on 1/20/15.
 */
object Chapter5 {

  def question1():Unit = {
    /**Improve the Counter class so it does not return a negative number at Int.MaxValue
      *MaxValue: Int(2147483647)
      * This is a verbose solution.  Easier approach is to use a long instead of an int for the counter
      */
    class Counter {
      private var value: Int = 2147483646 // Initialized to Int.maxValue -1 for test purposes
      private var valueL: Long = 2147483647

      def increment() {
        if (value < 2147483647) value += 1
        else valueL += 1} // Methods are public by default

      def current() = if (valueL < 2147483647) value
      else valueL
    }

    val myCounter = new Counter // or new Counter()
    myCounter.increment()
    println(myCounter.current)

    myCounter.increment()
    println(myCounter.current)

    myCounter.increment()
    println(myCounter.current)

  }


  }


  def question2():Unit = {
    /**Create class BankAccount w/ methods for deposit and withdraw and a read-only property
     *balance.
     */
    class BankAccount {
      private var balance: Double = 0.00 // Must initialize the field

      def deposit(input: Double) {
        balance += input
        println("Your deposit was was processed and your new balance is $" + f"$balance%1.2f")
      }

      def withdrawal(input: Double) {
        balance -= input
        println("Your withdrawal was processed and your new balance is $" + f"$balance%1.2f")
      }

      def myBalance() {println("Your balance is $" + f"$balance%1.2f")}
    }

    val myBank = new BankAccount

    myBank.myBalance
    myBank.deposit(100.00)
    myBank.withdrawal(34.23)
    myBank.myBalance

  }

  def question3():Unit = {
/**
 * Write a class time
 * Read-only properties hours and minutes
 * method before(other: Time): Boolean that checks for this time before the other
 * Time object constructed as new Time(hrs, min)
 * hrs is military time between 0 and 23
 */


  class time (val hrs: Int, val min: Int){
    def before(other: time): Boolean =
      if (other.hrs < hrs || other.hrs == hrs && other.min < min) true else false
  }

  val myTime = new time(10, 32)
  val yourTime = new time(10, 31)

  println("MyTime" + myTime.hrs + ":" + myTime.min)
  println("YourTime" + yourTime.hrs + ":" + yourTime.min)
  println("Is YourTime before MyTime?  " + myTime.before(yourTime))

  }


  def question4():Unit = {
    /**
     *Reimplement Time class:  Hours 0-23 and mins 0-60.
     */
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

  def question5():Unit = {
    /**
     *
     */



  }

  def question6():Unit = {
    /**
     *
     */



  }

  def question7():Unit = {
    /**
     *
     */



  }

  def question8():Unit = {
    /**
     *
     */



  }

  def question9():Unit = {
    /**
     *
     */



  }

  def question10():Unit = {
    /**
     *
     */



  }



}
