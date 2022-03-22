package homeworkweek7;

import java.util.Locale;
import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (using switch statement) if
 * any other alphabet should be invalid entry
 */

public class Program9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Character between A to F : "); // user input
        char alfa = reader.nextLine().toLowerCase().charAt(0); // reader convert it Lowercase
        getCityName(alfa);
    }
    // Static Method to use switch case to get city name
    static String getCityName(char alfa){
        String cityname;
        String cityName;
        switch(alfa){
            case 'a':
                cityName = "Ahmedabad";
                break;
            case 'b':
                cityName = "Baroda";
                break;
            case 'c':
                cityName = "Calcutta";
                break;
            case 'd':
                cityName = "Dehradun";
                break;
            case 'e':
                cityName = "Elora";
                break;
            case 'f':
                cityName = "Faridabad";
                break;
            default:
                cityName = "Input valid char between a to f";
        }
        System.out.println(cityName); //Return City name
        return cityName;

        }
    }

