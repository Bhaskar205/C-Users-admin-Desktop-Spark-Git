object Main
{
  def main(args: Array[String]): Unit = {
     var empSalary="8000"
     var empHike=empSalary.toInt+500
     println("Value of empSalary after Conversion to Int: "+empHike)
     println("Value of empSalary after Conversion to Double: "+empSalary.toDouble)
     val empRating=1
    // empRating=3
     println("Value of empRating after Conversion to String: "+empRating.toString()+" is Sharon Rating for this cycle")
   }   
}