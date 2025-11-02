package Task2;

public class Customer1 {
    public static String combineNames(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println("Full Name: " + combineNames(firstName, lastName));
    }
}


