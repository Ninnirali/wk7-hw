package homeworkweek7;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        char grade = 0;
        double Total;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student's Name : ");
        String Name = scanner.next();
        System.out.println("Enter Student's Roll Num :   ");
        int RollNo = scanner.nextInt();
        System.out.println("Enter Student's Maths Marks:   ");
        double Maths = scanner.nextDouble();
        //if (Maths >= 0 && Maths <= 100) {
        //  System.out.println();
        // } else {
        //System.out.println("Please enter value for Maths Marks again (Range  between 1 and 100)");
        System.out.println("Enter Student's Science Marks:   ");
        double Science = scanner.nextDouble();
        System.out.println("Enter Student's English Marks:   ");
        double English = scanner.nextDouble();
        Total = English + Maths + Science;

        System.out.println("Total marks out of 300 are : " + Total);// Total Marks to display
        double percentage = ((Total / 300) * 100); // Percentage to display
        System.out.println("Percentage :  " + percentage);
        String result; // result to display
        // Workout result to display
        if (Maths < 35 || Science < 35 || English < 35) {
            result = "Fail";
            grade = 'f';
        } else if (percentage <= 79 && percentage >= 60) {
            result = "Pass";
            grade = 'A';
        } else if (percentage >= 80) {
            result = "Pass";
            grade = 'A';
        } else if (percentage <= 59 && percentage >= 50) {
            result = "Pass";
            grade = 'B';
        } else if (percentage <= 49 & percentage >= 35) {
            result = "Pass";
            grade = 'C';
        } else {
            result = "FAIL";
        }
        System.out.println("|__________________________________________________|");
        System.out.println("|                                                  |");
        System.out.println("|                     Mark Sheet                   |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Name      :    " + Name + "             |");
        System.out.println("|          RoLlNum   :    " + RollNo + "          |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Subject   :          Marks              |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Maths     :     " + Maths + "           |");
        System.out.println("|          Science   :     " + Science + "         |");
        System.out.println("|          English   :     " + English + "         |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Total     :    " + Total + "            |");
        System.out.println("|__________________________________________________|");
        System.out.println("|          Percentage:    " + percentage + "       |");
        System.out.println("|          Result    :     " + result + "          |");
        System.out.println("|          Grade     :         " + grade + "       |");
        System.out.println("|__________________________________________________|");
    }
}
