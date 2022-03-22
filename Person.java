package homeworkweek7;
//Program 14

public class Person {

    //instance variables
    String firstName;
    String lastName;
    int age;

    //instance method 1- With return no parameters
    public String getFirstName() {
        return firstName;
    }

    //instance method 2- With return no parameters
    public String getLastName() {
        return lastName;
    }

    //instance method 3- With return no parameters
    public int getAge() {
        return age;
    }

    //instance method 4- No return with parameters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //instance method 5- No return with parameters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //instance method 6- No return with parameters
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    //instance method 7- without parameters
    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    //instance method 8- without parameters
    public String getFullName() {
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        } else {
            return firstName + " " + lastName;
        }
    }

    //main method
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}













