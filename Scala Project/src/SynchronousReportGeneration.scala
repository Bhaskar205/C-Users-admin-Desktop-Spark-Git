object SynchronousReportGeneration
{
  case class Employee(name: String, salary: Double)

  //A mock method simulating service call
  def GetFinancialDetails(): Employee = {
    Thread.sleep(2000) // Simulating a delay
    Employee("John",50000.0)
  }

  case class Dependants(name: String, relationship: String)
  //A mock method simulating service call
  def GetDependentDetails(): List[Dependants] = {
    Thread.sleep(2000) // Simulating a delay
    List(Dependants("Mary","Wife"),Dependants("Leon","Son"))
  }

  def main(args: Array[String]): Unit = {

    val t0 = System.currentTimeMillis()
    //Getting the financial details
    val finData = GetFinancialDetails()
    //Getting the dependant details
    val depData = GetDependentDetails()

    println(finData)
    println(depData)
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) / 1000.0 + "seconds")

  }
}
