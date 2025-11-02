package Task2;

public class Customer4 {
    public static int countMessageLength(String messege){
        return messege.length();
    }
    public static void main(String[] args) {
        String messege = "hey hello";
        System.out.println("messege length " + countMessageLength(messege));
    }

}

