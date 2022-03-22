package homeworkweek7;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,  * /, *) find addition,
 * Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double a, b;
        char operator;
        System.out.println("Enter first number:");
        a = obj.nextDouble();// ask users to enter first number
        System.out.println("Enter second number:");
        b = obj.nextDouble();// ask users to enter second number

        System.out.println("Choose an operator:+,-,*,/");
        operator = obj.next().charAt(0);//ask users to enter operator
//Do operation of selected operator by using if..else statements
        if (operator == '+') {
            System.out.println("Addition of two number is: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Subtraction of two number is: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Multiplication of two number is: " + (a + b));
        } else if (operator == '/') {
            System.out.println("Division of two number is: " + (a / b));
        } else {
            System.out.println("Invalid operator");
        }
    }
}
