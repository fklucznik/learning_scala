

object Objects0 extends App {
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
