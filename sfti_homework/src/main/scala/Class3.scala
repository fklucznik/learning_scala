/**
 * Created by frank on 2/18/15.
 */
object Class3 extends App{
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
