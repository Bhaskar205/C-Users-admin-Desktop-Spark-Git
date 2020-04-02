

object Main {
    def main(args: Array[String]) {
       //code to display usage of escape sequence
       
      println("Escape Sequence: \"Have\ta nice\n\nDay\"" );
      
       /*code to display usage of identifiers*/
       
      var _employeeName="Sharon John"
      
      println("Identifier: "+_employeeName)
      
      println("Data type of _employeeName: "+_employeeName.getClass())
      
      // code to display usage of multi-line String
      var scalaLiteral="""I hava a
                            pet
                           Dog!!!!!!"""
      println("Multi-line literals: "+scalaLiteral)
   }
} 
