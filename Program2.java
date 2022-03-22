package homeworkweek7;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
import java.util.Scanner;

public class Program2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //user input using scanner
        System.out.println("Enter any Year in xxxx format :  ");
        int year = scan.nextInt(); // input saved in year variable
        scan.close();
        boolean isLeap = false;

        if (year % 4 == 0)  //If the year is evenly divisible by 4 then it's a leap year
        {
            if (year % 100 == 0) //If the year is evenly divisible by 100 then it's not leap year
            {
                if (year % 400 == 0) //If the year is evenly divisible by 400 then it's a leap year
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap == true) //Display Result to user
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }


}

