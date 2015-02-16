/**
 * Created by frank on 2/16/15.
 */
object Class0 extends App {

  class Person(val name: String, var age: Int){
    println("Just constructed a new person")
    def description = name + " is " + age + " years old."
  }

  val driver = new Person("Mike", 38)

  driver.age = 40


 // println(driver.name)

  println(driver.age)

  //println(driver.description)



}
