package homeworkweek7;
/**
 * Write a Java program to sum values of an array
 */
public class Program18 {
    //manual input of values in array
    public static void main(String[] args) {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        // arrays in loop to add values in variable sum
        for (int i : my_array)
            sum += i;

        System.out.println("The sum is " + sum);
    }
}
