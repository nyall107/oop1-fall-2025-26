package Project;
import java.util.Scanner;
public class Mortgage {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P = in.nextDouble();

        System.out.print("Enter annual interest rate (example 0.05 for 5%): ");
        double rate = in.nextDouble();

        System.out.print("Enter loan term in years: ");
        int years = in.nextInt();

        int n = years * 12;      
        double r = rate / 12;    

        double f = Math.pow(1 + r, n);
        double M = P * (r * f) / (f - 1);

        double total = M * n;
        double interest = total - P;

        System.out.println("Monthly Payment: " + M);
        System.out.println("Total Amount Paid: " + total);
        System.out.println("Total Interest Paid: " + interest);

        
    }
}