package demo

import org.scalatest.FunSuite

/**
 * Created by frank on 12/20/14.
 */
class HelloTest extends FunSuite {
  test("sayHello method works correctly") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
