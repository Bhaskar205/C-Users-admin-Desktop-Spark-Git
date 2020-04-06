object Anonymousfunctionandhighorderfunction {
  def main(args:Array[String])
  {
      //High order function
    println("Sum of Even Nos: "+genericTotal(empScore => empScore%2==0, List(12,23,36,45,58)) )         // Sum of even numbers
    println("Sum of Odd Nos: "+genericTotal(empScore => empScore%2==1, List(12,23,36,45,58)))          // Sum of odd numbers
    println("Sum of numbers greater than 3: "+genericTotal(empScore => empScore>3, List(2,23,36,45,58)))         
    
    //Default Parameters
    println( "  Default Parameters with No argument : " + totalSalary() );
    println( "  Default Parameters with 1 argument : " + totalSalary("Sharon") );
    println( "  Default Parameters with 2 argument: " + totalSalary("John",3500) );    
  }
  // Sample 1: High Order
    def genericTotal(funcScore: Int => Boolean, scoreList: List[Int]) = {
    var sum = 0
    scoreList.foreach{ score => if(funcScore(score)) sum += score } 
    sum
    }
    
    //Sample 2: High Order
    def squareList(score: Int ) = score * score
    val empScore = List( 12 , 24 , 36  , 48 , 50 )
    val empResult = empScore.map( squareList )
    println("High Order: "+ empResult ) 
    
    //Anonymous functions
    var empHike = (totSalary: Int, hikePer: Int) => totSalary*hikePer/100
    println("Anonymous Function: "+empHike(45000,5))
   
   //Default Parameters
    def totalSalary( name:String="Janet", salary:Double=7500.00 ) : Double = {
      var total:Double = 0
      total = total + salary
      print("Name: "+name)
      return total
   }
}