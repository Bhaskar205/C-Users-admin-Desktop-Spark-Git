object Callbyvalue 
{
  def printResult(score:Int)={
    println("Received parameter in printResult")
    println("Parameter in printResult : " + score)
    println("Parameter in printResult : " + score)
  }
  def calculateScore(score1:Int,score2:Int)={
    println("Computed result in CalculateScore : " + (score1+score2))
    score1+score2
  }

  def main(args: Array[String]): Unit = {
    printResult(calculateScore(10, 20))
  }
}
