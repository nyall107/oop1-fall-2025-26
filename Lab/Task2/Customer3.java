package Task2;

public class Customer3 {
    public static String extractUsername(String email) {
        int atIndex = email.indexOf("@");
        return email.substring(0, atIndex);
    }
    public static void main(String[] args) {
        String email = "nyall@gmail.com";
        System.out.println("Username " + extractUsername(email));
    }
}
