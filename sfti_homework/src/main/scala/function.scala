/**
  * Created by frank on 12/22/14.
  */
object function extends App {

   def signum (x:Double) : Int = {
     if(x == 0) {0
     }else if(x < 0) {-1
     }else {1
     }
   }
   println(signum(123456))
 }


