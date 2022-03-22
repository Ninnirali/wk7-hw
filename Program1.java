package homeworkweek7;

/**
 * Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // user input number by Scanner
        System.out.println("Enter your number");
        int num = scanner.nextInt(); // input stored in num variable

        String result = (num% 2 ==0) ? "Even" : "Odd"; // Checking odd or even using ternary operator (?:)
        System.out.println("Number is : " + result);

    }


}
