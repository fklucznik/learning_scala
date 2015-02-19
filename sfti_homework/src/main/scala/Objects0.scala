

object Objects0 extends App {
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
