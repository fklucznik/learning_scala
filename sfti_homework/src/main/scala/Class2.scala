/**
 * Created by frank on 2/17/15.
 */
object Class2 extends App {

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

  //println(myBank.myBalance)
  myBank.deposit(100.00)
  myBank.withdrawal(34.23)
  myBank.myBalance
}
