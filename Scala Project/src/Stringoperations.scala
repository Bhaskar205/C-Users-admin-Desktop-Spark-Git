object Stringoperations {
    def main(args: Array[String]): Unit = {
       
    val courseName = "Programming in Scala"
    
    // Converting to upper case
	val modifiedCourseName = courseName.toUpperCase() 
    println("The given string capitalized: " + modifiedCourseName)
    
    // Replacing the character 'm' in the given string with 'M'
    val courseReplace=courseName.replace('m','M')
    println("Result of replacing m with M in the string: "+courseReplace)
    
    // Checking whether the given string starts with P
    val check=courseName.startsWith("P")
    println(check)
    
    // String Interpolation
    var marksInCourse=75
    var totMarks=s"Marks Is: ${marksInCourse+10}"
    println("The s interpolator: "+totMarks)
    
    val price=25.3
    val vegPrice=f"Vegetable Price: $price%.2f"
    println("The f interpolator: "+vegPrice)
    
    //Regular Expression
     val pattern="Scala".r
     val courseCont="Scala is a powerful language. Scala is multi-paradigm"

     println("Regular Expression: findFirstIn() without mkString:"+(pattern findFirstIn courseCont))//Some(Scala)
     println("Regular Expression: findFirstIn() with mkString:"+(pattern findFirstIn courseName).mkString)//Scala
    }
}
