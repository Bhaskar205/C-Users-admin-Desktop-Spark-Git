
object Function 
{
  def printResult(score: => Int) = { // note the syntax. Parameter name:<space>=>return type of the method
    println("Received parameter in printResult")
    println("Parameter in printResult : " + score)
    println("Parameter in printResult : " + score)
  }

  def calculateScore(score1:Int,score2:Int)={
    println("Computed result in calculateScore : " + (score1+score2))
    score1+score2
  }

  def main(args: Array[String]): Unit = {
    printResult(calculateScore(10, 20))
  }
}
