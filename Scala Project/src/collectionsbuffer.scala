import scala.collection.mutable.ListBuffer

object collectionsbuffer {

  def main(args: Array[String]): Unit = {

    val empNumList_1: ListBuffer[Int] = ListBuffer(1001, 1002, 1002, 1003)
    empNumList_1 += 1004 // Adding an element
    empNumList_1 -= 1002 // Removing an element
    println("empNumList_1: "+empNumList_1)

    val empNumList_2: List[Int] = List(1006, 1007, 1008)
    val empListBuffer = empNumList_1 ++ empNumList_2 // Type of allEmpNums will be ListBuffer
    println("Employee List Buffer: "+empListBuffer)
    val empList = empNumList_1 ++: empNumList_2 // Type of allEmpNums_1 will be List
    println("Employee List: "+empList)

    println(1001 +: empListBuffer) // Prepending
    println(empList :+ 1001) // Appending
    println(empList ::: List(1097, 1098, 1099)) // Adding elements from another list
    println(1099 :: empList) // Adding element to the beginning
    println((10 /: empNumList_2)(_ + _)) // foldLeft using addition
    println((empNumList_2 :\ 10)(_ * _)) // foldRight using multiplication
  }
}
