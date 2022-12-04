// Imports Scanner to accept keyboard input from program user
import java.util.Scanner;
   public class Main {
       public static void main(String[] args) {
           // Prints the programming specifications for the project
           System.out.println("Write a program that allows a student to enter up to 10 test quiz scores, computes the average score, and then displays the letter grade");
           // Creates Scanner object
           Scanner scanner = new Scanner(System.in);
           // Creates grades array holding 10 grades
           int grade[] = new int[10];
           // Creates counter variable to hold number of grades entered
           int i;
           // Creates variables to hold total of grades and the calculated average grade
           float gradeTotal = 0, gradeAvg;
           /* For loop runs while up to 10 grades are entered, and counter i increases by 1 each time a new grade is entered */
           for (i = 0; i < 10; i++) {
               // Prompts user to enter grade + displays counter value
               System.out.print("Enter grade " + (i + 1) + " or enter 999 to quit: ");
               // Terminates program if 999 is entered by user
               int temp = scanner.nextInt();
               if (temp == 999) {
                   System.out.println("Program terminated");
                   return;
               }
               /* Otherwise, program continues, allows user input to be stored in variable grade */
               grade[i] = temp;
               // Adds new grade input to total grade to update variable gradeTotal
               gradeTotal = gradeTotal + grade[i];
           }
           // Uses for loop to cycle through and display array of grades entered
           System.out.println("The grades you entered are: ");
           for (i = 0; i < grade.length; i++) {
               System.out.println(grade[i]);
           }
           /* Calculates average grade by dividing the total grade by 10 (the number of grades entered) */
           gradeAvg = gradeTotal/10;
           /* Uses if-else statements to determine letter grade based on average grade, and displays both */
           System.out.print("Your average grade is: " );
           if (gradeAvg >=90 && gradeAvg <=100)
           {
               System.out.print(gradeAvg + ", an 'A'");
           }
           else if (gradeAvg >= 80 && gradeAvg <90)
           {
               System.out.print(gradeAvg + ", a 'B'");
           }
           else if (gradeAvg >= 70 && gradeAvg <80)
           {
               System.out.print(gradeAvg + ", a 'C'");
           }
           else if (gradeAvg >= 60 && gradeAvg <70)
           {
               System.out.print(gradeAvg + ", a 'D'");
           }
           else if (gradeAvg >= 0 && gradeAvg <60)
           {
               System.out.print(gradeAvg + ", an 'F'");
           }
       }
   }

