// Fig. 4.10: ClassAverage.java
// Solving the class-average problem using sentinel-controlled iteration. 
import java.util.Scanner; // program uses class Scanner

public class ClassAverage {
   public static void main(String[] args) {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner(System.in);

      // initialization phase
      int total = 0; // initialize sum of grades
      int gradeCounter = 0; // initialize # of grades entered so far
      
      // processing phase
      // prompt for input and read grade from user
      System.out.print("Enter grade or -1 to quit: "); 
      int grade = input.nextInt(); 

      // loop until sentinel value read from user
      while (grade != -1) {
         total = total + grade; // add grade to total
         gradeCounter = gradeCounter + 1; // increment counter 

         // prompt for input and read next grade from user
         System.out.print("Enter grade or -1 to quit: "); 
         grade = input.nextInt(); 
      }

      // termination phase
      // if user entered at least one grade...
      if (gradeCounter != 0) {
         // use number with decimal point to calculate average of grades
         double average = (double) total / gradeCounter;  

         // display total and average (with two digits of precision)
         System.out.printf("%nTotal of the %d grades entered is %d%n", 
            gradeCounter, total);
         System.out.printf("Class average is %.2f%n", average); 
      } 
      else { // no grades were entered, so output appropriate message
         System.out.println("No grades were entered"); 
      }
   } 
} 

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
