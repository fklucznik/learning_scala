package org.s_mach.frank_w_klucznik

/**
 * Created by frank on 12/22/14.
 */
object Chapter2 {

  def question1():Unit = {
    /** The signum of a number is 1 if positive, 0 if 0, and -1 if negative. Write a function that computes
      * this value. Code follows below.
      */

    object function extends App {

      def signum(x: Double): Int = {
        if (x == 0) {
          0
        } else if (x < 0) {
          -1
        } else {
          1
        }
      }

      println(signum(123456))
    }
  }

  def question2():Unit = {
    /** {} contains a sequence of expressions; the value of the block is the value of
      * the last expression. An empty {} denotes the Unit type (i.e., wallet with one
      * dollar that you cannot spend b/c void has a single value).
       */

  }

  def question3():Unit = {
      /** x = y = 1 only if you define x and y prior to this line.
        * If desire to assign 1 to bot X and Y then:  var x@y = 1 is appropriate
        * x = y = 1 assigns Unit type to x and fails unless you define x as a Unit
        * type first.  For example the following works in REPL:
        * var x:Unit = {}
        * var y = 0
        * x = y = 1
        */
  }

  def question4():Unit = {

    object loop extends App{
      /** Write a scala equivalent for the Java algorithm:  for (int i = 10; i >= 0; i--) System.out.println(i);
        * Scala While loop equivalent
        * OUTPUT:
        * 10 9 8 7 6 5 4 3 2 1
        * 10 9 8 7 6 5 4 3 2 1
        */
      var n: Int = 10
      while (n > 0) {
        print(n + " ")
        n -= 1
      }
      //line feed
      print("\n")

      //Scala for loop equivalent
      var sum = 10
      for (i <- 1 to 10) {
        print(sum + " ")
        sum -= 1
      }
      //line feed
      print("\n")

      /** Did this to see iteration w/ character string; pretty cool
        * OUTPUT:
        * 82 H
        * 183 e
        * 291 l
        * 399 l
        * 510 o
        */

      sum = 0
      for (ch <- "Hello") {
        sum += ch
        print(sum + " " + ch + "\n")
      }
    }

  }

  def question5():Unit = {
    /**
     * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
     * OUTPUT: 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
     */
    object loop2 extends App {

      countdown(20)

      def countdown (n:Int) : Unit = {
        var m = n
        while (m > 0) {
          print(m + " ")
          m -= 1
        }
      }
    }

  }

   def question6():Unit = {
      /**
        * Write a FOR loop for computing the product of the Unicode codes of all letters in a string.  For example
       * the product of the characters in "Hello" is 825152896.
        */

      object character extends App {

        var x = 1
        for (c <- "Hello") x *= c.toInt
        print(x)

      }
   }

    def question7():Unit = {
      /**
       * Solve the preceding exercise without writing a loop. (Hint: Look at the StringOps Scaladoc.)
       */
      object String2 extends App{

        print("Hello".map(_.toInt).product)

      }
    }

    def question8():Unit = {
      /**
       * Write a function produce(s:String) that computes the product, as described in the preceding exercises.
       */
      object string3 extends App{

        def product (ch:String) : Int = {
          ch.map(_.toInt).product
        }

        print(product("Hello"))

      }
    }

    def question9():Unit = {

      println("question9!")
      /**
       * Make the function of the preceding exercise a recursive function.
       */

      object Recursive extends App{

        def product (ch:String) : Int = {

          def loop (index:Int, product:Int ) : Int = {

            println(s"Loop => index=$index product=$product")

            if(index <= ch.indices.last) {
                val tmp = ch.charAt(index).toInt
                loop(index+1, tmp * product)
            } else {
                product
            }
          }

          loop (0,1)

        }

      }

    }

    def question10():Unit = {
      /**
       * Make a function that computes Xn, where n is an integer. Use the following recursive definition.
       */
      def power(x: Double, n: Int) : Double = {

        if (n == 0) {
          //Use case n = 0
          1.0
        } else if (n < 0) {
          //Use case n is negative
          power(1.0 / x, n * -1)

        } else if (n % 2 == 0) {
          //Use case n is positive and even
          val y = power(x, n / 2)
          y * y
        } else {
          //Use case n is positive and odd
          x * power(x, n - 1)
        }
      }
      println(power(5.0, -4))

    }


}
