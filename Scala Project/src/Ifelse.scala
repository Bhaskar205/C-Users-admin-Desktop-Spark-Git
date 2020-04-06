
object Ifelse {
    def main(args: Array[String])
    {
        //Tryout if-else 
      val certScore = 88
      val certResult =
      if ( /* Condition */ )
              /* Your code */ 
      else
          /* Your code */ 
      println("Result: " + certResult)
           
        //Tryout pattern matching
      println(matchType("two"))
      println(matchType("test"))
      println(matchType(1))
      println(matchType(2))
      println(matchType(5))
   }
   
   def matchType(checkType: Any): Any = checkType match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case unknown => "many"
   }
}