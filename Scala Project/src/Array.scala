import Array._

object Array {
   def main(args: Array[String]) {
      var empSalary = Array(5000, 2500, 2000, 3400)
      
      // Print all the array elements
      println("Employee Salary:")
      for ( sal <- empSalary ) {
         println(sal)
       }

      // Summing all elements
      var totalSalary = 0;
      for ( i <- 0 to (empSalary.length - 1)) {
         totalSalary += empSalary(i);
      }
      println("Total Salary is: " + totalSalary);

      // Finding the largest element
      var maxSal = empSalary(0);
      for ( i <- 1 to (empSalary.length - 1) ) {
         if (empSalary(i) > maxSal) maxSal = empSalary(i);
      }
      println("Max Salary is: " + maxSal);
      
      //Using Range in Arrays
      
      var empHike1 = range(10, 20, 2)
      var empHike2 = range(10,20)

      // Print all the array elements
      println("Range values for Employee Hike List1: ")
      for ( employeeHike <- empHike1 ) {
         print( " " + employeeHike )
      }
      println()
        println("Range values for Employee Hike List2: ")
      for ( employeeHike <- empHike2 ) {
         print( " " + employeeHike )
      }
   println()
   
   //Multi-dimensional Arrays   
   println("Employee Matrix")
   var seatNo=1001
      var employeeMatrix = ofDim[Int](3,3)
      for (row <- 0 to 2) {
         for ( col <- 0 to 2) {
            employeeMatrix(row)(col) = col+seatNo;
         }
         seatNo=seatNo+5
      }
      for (row <- 0 to 2) {
         for ( col <- 0 to 2) {
            print(" " + employeeMatrix(row)(col));
         }
         println();  
     }

         // Removing duplicate elements from the array using distinct
         val empName = Array("Sharon", "John", "Sharon","Leon", "John")
        val empDistinct=empName.distinct
        println("Finding Distinct Employee Name:")
        for(uniqueName <- empDistinct)
          println(uniqueName)
     }
}