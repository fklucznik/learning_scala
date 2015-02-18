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
     * Create student class w/ ID and Name.  Demonstrate Java Bean options.
     * This option is useful for use with Java tools that expect Java methods
     */

    class student (@scala.beans.BeanProperty var name: String, @scala.beans.BeanProperty var id: Long){
      println("New student class created with name and id")
    }

    //Generate new student class to test
    val myStudent = new student("Jimmy Fallen", 1234567890)

    //Demonstrate scala getter
    println("Scala getter " + myStudent.name + "  " + myStudent.id)

    //Demonstrate scala setter
    myStudent.name_=("Sammy Smith")
    myStudent.id_=(9999999999L)
    println("After update with scala setter " + myStudent.name + "  " + myStudent.id)

    //Demonstrate JavaBeans getter
    println("JB getter " + myStudent.getName() + "  " + myStudent.getId())

    //Demonstrate JB setter
    myStudent.setName("Katy Smith")
    myStudent.setId(111111111L)
    println("After update with JB setter " + myStudent.name + "  " + myStudent.id)

  }

  def question6():Unit = {
    /**
     *Primary constructor turns negative ages into 0.
     */
    class Person(private var privateAge: Int = -3 ) {
      if (privateAge < 0) privateAge = 0

      def age = privateAge

      def age_=(newValue: Int) {
        if (newValue > privateAge) privateAge = newValue
      }
    }

    val dick = new Person

    println(dick.age)

    dick.age = 5

    println(dick.age)

  }

  def question7():Unit = {
    /**
     * Create person class that takes a Fname Lname string, and break string into two parts.
     */
    class Person(private var privateName: String ) {

      val splitName = privateName.split(" ").array

      def firstName = splitName(0)

      def lastName = splitName(1)
    }

    val dick = new Person("Mike Sanders")

    println(dick.firstName + " " + dick.lastName)

  }

  def question8():Unit = {
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

  def question9():Unit = {
    /**
     * Nope..not going to do this one. One language at at time.  :-)
     */



  }

  def question10():Unit = {

/**
 * Update class using explicit fields ad a default primary constructor.  Which form do you prefer and why?
 *
 * class Employee(val name: String, var salary: Double) {
 * def this() { this("John Q. Public", 0.0) }
 * }
 */

    //Updated class
    class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) { }

    //Less code supports all combinations of creation
    val e1 = new Employee()

    val e2 = new Employee("Frank Klucznik")

    val e3 = new Employee("Frank Klucznik", 100.00)

    val e4 = new Employee(salary = 500.00)//Why did I have to specify "salary =" in this and not "name =" in e2?

    println(e1.name, e1.salary)
    println(e2.name, e2.salary)
    println(e3.name, e3.salary)
    println(e4.name, e4.salary)

  }



}
