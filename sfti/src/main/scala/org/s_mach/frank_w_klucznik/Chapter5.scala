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
     *
     */



  }


  def question4():Unit = {
    /**
     *
     */



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
