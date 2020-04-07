import scala.util.{Try, Success, Failure}

case class Employee(
  empId: Int,
  empName: String,
  empSalary: Float,
  empGender: Option[String])

object Tryeither extends App{
  private val employees = Map(1 -> Employee(10, "John", 52000.0f, Some("male")),
    2 -> Employee(12, "Sharon", 7000.0f, Some("female")))
  
      //Try[T]
      println("Try[T] Sample Example") 
      def salaryDisplay(x:Int)={
        val empSalary=Map(1->5000, 2->14000,3->Try(3000/0))
         Try(empSalary(x))
          }
           for(x<-1 to 3){
             println("Employee Salary{Y/N}: "+salaryDisplay(x))
        }
        
         //Either[T]    
           println("Either[T] Sample Example") 
     def hikeSalary(x:String): Either[String, Int] = {
      try{
        Right(x.toInt+5000)
      }
      catch{case e=> Left("Invalid Data->Conversion failed")}
    }

    hikeSalary("7000") match {
    case Left(s) => println("Salary-No Hike: " + s)
    case Right(i) => println("Salary Hiked: " + i)
  }
}

