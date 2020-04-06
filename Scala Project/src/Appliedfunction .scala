import java.util.Date
object Appliedfunction {
     def main(args: Array[String]) {
     
     //Currying Demo
      val empName:String = "John"
      val empId:String = "1005 "
      val empTrack:String = "Java!"
      println( "Currying Demo : " +  empDataConCat(empName)(empId)(empTrack))
      
      //Partially Applied Functions
      val date = new Date
      val logDetailsWithDate = employeeLog(date, _ : String)
      logDetailsWithDate("First Employee" )
      Thread.sleep(1000)
      logDetailsWithDate("Second Employee" )
      Thread.sleep(1000)
      logDetailsWithDate("Third Employee" )
   }
// Function call to curry demo
   def empDataConCat(name: String)(id: String)(track: String)= {
      name + id + track
   }
// Function call to partially Applied Functions
   def employeeLog(date: Date, employee: String)  = {
     println(date + "----" + employee)
   }
}
