case class Employee(
  empId: Int,
  empName: String,
  empSalary: Float,
  empGender: Option[String])

object collectionoption extends App{
  private val employees = Map(1 -> Employee(10, "John", 52000.0f, Some("male")),
    2 -> Employee(12, "Sharon", 7000.0f, Some("female")))
   println("First Employee: " + showEmployee(employees.get(2)))
   println("Third Employee : " + showEmployee(employees.get(3)))
      
    def showEmployee(x: Option[Object]) = x match {
      case Some(s) => s
      case None => "No Such Employee exists!!"
   }
   
    //getorElse
      val empId:Option[Int] = Some(1005)
      val empName:Option[Int] = None 
      
      println("Employee ID: " + empId.getOrElse(0) )
      println("Employee Name: " + empName.getOrElse("SharonJohnJ") )
}

