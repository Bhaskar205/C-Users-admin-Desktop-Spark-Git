

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object MaArrayBufferin {
  
  def main(args: Array[String]) {

     var empCount = new ArrayBuffer[Int] ()

    empCount += 1
     println("Employee Count Value is: "+empCount)
     empCount+= ( 2 , 3 , 4 , 5 )
     println("Employee Count Value is: "+empCount)
     empCount.trimEnd(2) 
     println("Employee Count Value after Trim: "+empCount)
     empCount.insert( 3 , 4 ) 
     println("Employee Count Value after insert: "+empCount)
    empCount.insert( 4 , 5 , 6  , 7,7 )  
     println("Employee Count Value after insert: "+empCount)
     empCount.remove(2)
     println("Employee Count Value after remove: "+empCount)
     empCount.remove( 2 , 3 )
     println("Employee Count Value after remove: "+empCount)
  }
}