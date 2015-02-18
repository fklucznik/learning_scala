

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
    private var model: String = ""
    private var manufacturer: String = ""
    private var year: Int = -1
    private var license: String = ""

      def this(model: String, manufacturer: String, year: Int){
        this()
        this.manufacturer = manufacturer
        this.model = model
        this.year = year
      }

      def this(model: String, manufacturer: String, year: Int, license: String){
        this()
        this.manufacturer = manufacturer
        this.model = model
        this.year = year
        this.license = license
      }
  }

}
