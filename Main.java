import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b; 

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
