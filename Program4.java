package homeworkweek7;

import java.util.Scanner;

public class Program4 {

    static int year;
    static int month;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        year = scanner.nextInt();

        System.out.println("enter month between 1 to 12");
        month = scanner.nextInt();
//        if(month < 1 && month > 12)
//        {
//            System.out.println("enter valid year between 1 to 12");
//        }

        Program4 p4 = new Program4();
        isLeapYear(year);
        p4.getDaysInMonth(month, year);

    }

    public static boolean isLeapYear(int year) {


        if (year >= 1 && year <= 9999) {

            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " is a leap year");
                System.out.println("        ");
            } else {
                System.out.println(year + " is not a leap year");
                System.out.println("        ");
            }
            return true;
        } else {
            System.out.println("not a valid year");
            return false;
        }
    }

    public void getDaysInMonth(int month, int year) {
        this.month = month;
        if (month < 1 || month > 12) {
            System.out.println("enter between 1 and 12");
        } else {
            int days = 0;
            switch (month) {
                case 1:
                    System.out.println("january");

                    System.out.println("days is 31");
                    break;
                case 2:
                    System.out.println("february");
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                        days = 29;
                        System.out.println("days is " + days);
                    } else {
                        days = 28;
                        System.out.println("days is " + days);
                        break;
                    }
                case 3:
                    System.out.println("march");
                    System.out.println("days is 31");
                    break;

                case 4:
                    System.out.println("april");
                    System.out.println("days is 30");
                    break;

                case 5:
                    System.out.println("may");
                    System.out.println("days is 31");
                    break;

                case 6:
                    System.out.println("june");
                    System.out.println("days is 30");
                    break;

                case 7:
                    System.out.println("july");
                    System.out.println("days is 31");
                    break;

                case 8:
                    System.out.println("august");
                    System.out.println("days is 31");
                    break;

                case 9:
                    System.out.println("september");
                    System.out.println("days is 30");
                    break;

                case 10:
                    System.out.println("october");
                    System.out.println("days is 31");
                    break;

                case 11:
                    System.out.println("november");
                    System.out.println("days is 30");
                    break;

                case 12:
                    System.out.println("december");
                    System.out.println("days is 31");
                    break;
            }


        }


    }
}

