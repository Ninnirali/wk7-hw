package homeworkweek7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // user input character
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        // Checking input type using if statement
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + "  is an Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + "  is a Digit");
        } else {
            System.out.println(ch + "  is a Symbol");
        }
        scanner.close();
    }
}
