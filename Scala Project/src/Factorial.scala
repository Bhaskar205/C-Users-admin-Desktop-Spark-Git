import scala.annotation.tailrec

object Main extends App {

  println(factorial(4))

  // Function to calculate the factorial of a number
  def factorial(number: Int): Int = {
    @tailrec
    def factorialOf(number: Int, factorial: Int): Int = {
      if(number == 0) factorial
      else factorialOf(number - 1, factorial * number)
    }
    factorialOf(number, 1)
  }
}