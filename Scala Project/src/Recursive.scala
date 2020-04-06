object Recursive extends App {
    val listOfNumbers = List.range(1, 1000000)
    
    /* Finding sum using recursion */
    println(sumRec(listOfNumbers))
    
    /* Finding sum using tail recursion */
    //println(sumTailRec(listOfNumbers))
    
    // A recursive function to find the sum of the first n numbers
    def sumRec(numbers: List[Int]): Int = {
    numbers match {
      case Nil => 0
      case total :: tail => total + sumRec(tail)
    }
  }
  
  // A tail recursive function to find the sum of the first n numbers
  def sumTailRec(numbers: List[Int]): Int = {
    def sumOf(numbers: List[Int], sum: Int): Int = {
      numbers match {
        case Nil => sum
        case total :: tail => sumOf(tail, sum + total)
      }
    }
    sumOf(numbers, 0)
  }
}