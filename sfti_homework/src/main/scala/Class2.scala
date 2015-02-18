

object Class2 extends App {

  /**
   * Write a class car w/ read only properties for;
   * manufacturer
   * model name
   * modelyear
   * Read write properties for:
   * license plate (initially empty string)
   * model year (initially set to -1)
   * Use four constructors (all require manufacturer and modelname
   *https://www.safaribooksonline.com/library/view/scala-cookbook/9781449340292/ch04s04.html
 */

  class car {
    private var model = "Default"
    private var manufacturer = "Default"
    var year = -1
    var license = "Default"

    println("Primary Constructor Executed")

      def carModel = model

      def carManufacturer = manufacturer

      def this(model: String, manufacturer: String){
        this()
        this.manufacturer = manufacturer
        this.model = model
        println("First Auxiliary Constructor Executed \n")
      }

      def this(model: String, manufacturer: String, year: Int){
        this()
        this.manufacturer = manufacturer
        this.model = model
        this.year = year
        println("Second Auxiliary Constructor Executed \n")
      }

      def this(model: String, manufacturer: String, license: String, year: Int){
        this()
        this.manufacturer = manufacturer
        this.model = model
        this.license = license
        this.year = year

        println("Third Auxiliary Constructor Executed \n")
      }

  }

      val c1 = new car //primary constructor

      val c2 = new car("model", "manufacturer")//First auxiliary

      val c3 = new car("model", "manufacturer", 2015)//Second auxiliary

      val c4 = new car("model", "manufacturer", "VAB-4321", 2015)//Third auxiliary

      println(c1.carManufacturer, c1.carModel, c1.year, c1.license)

      println(c4.carManufacturer, c4.carModel, c4.year, c4.license)

}