package org.s_mach.frank_w_klucznik

/**
 * Created by frank on 1/20/15.
 */
object Chapter6 {

  def question1():Unit = {
    /**
     * Write object Conversions w/ methods:
     * inchesToCentimeter
     * gallonsToLiter
     * milesToKilometer
     */
    object Conversions {
      private var answer = 0.0
      def inchesToCentimeter(i: Double): Unit ={
        answer = i/0.39370
      }

      def gallonsToLiter(g: Double): Unit = {
        answer = g/0.26417
      }

      def milesToKilometer(m: Double): Unit = {
        answer = m/0.62137
      }
    }
  }


  def question2():Unit = {
    /**
     * Write object Conversions w/ methods:
     * inchesToCentimeter
     * gallonsToLiter
     * milesToKilometer
     */

    class UnitConversions{
      def conversions(a: Double, b: String): Double = {
        b match {
          case "i" =>
            UnitConversions.inchesToCentimeter(a)
            UnitConversions.answer
          case "g" =>
            UnitConversions.gallonsToLiter(a)
            UnitConversions.answer
          case "m" =>
            UnitConversions.milesToKilometer(a)
            UnitConversions.answer
        }
      }
    }


    object UnitConversions {

      private var answer = 0.0

      def inchesToCentimeter(i: Double){
        answer = i/0.39370
        println("object1  " + answer)
      }

      def gallonsToLiter(g: Double){
        answer = g/0.26417
        println("object2  " + answer)
      }

      def milesToKilometer(m: Double){
        answer = m/0.62137
        println("object3  " + answer)
      }

    }

    val test = new UnitConversions

    println("%4.1f".format (test.conversions(5.0,"i")))

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
