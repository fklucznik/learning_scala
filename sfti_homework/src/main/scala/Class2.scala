/**
 * Write a class time
 */
object Class2 extends App {

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
