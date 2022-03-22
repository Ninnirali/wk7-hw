package homeworkweek7;

import java.util.Scanner;

/**16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”*/
public class Program16 {
    public static void main(String []args)
    {
        int num;
        //Scanner class to read value
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any integer number: ");
        num=sc.nextInt();

        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.println(num + " is Positive Number.");
        else if(num<0)
            System.out.println(num + " is Negative Number.");
        else
            System.out.println("It's a Zero");
        sc.close();
    }
}