// Fig. 3.1: Account2.java
// Account class that contains an name instance variable 
// and methods to set and get its value.

public class Account {
   private String name; // instance variable

   // method to set the name in the object
   public void setName(String name) {
      // What is this key ===>
      // https://www.w3schools.com/JAVA/ref_keyword_this.asp#:~:text=The%20this%20keyword%20refers%20to,a%20method%20or%20constructor%20parameter).

      this.name = name; // store the name
   }

   // method to retrieve the name from the object
   public String getName() {
      return name; // return value of name to caller
   }
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
