import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bangladesh Mortgage Calculator (BDT) ===");

        System.out.print("Enter loan amount (Principal in BDT): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int years = scanner.nextInt();

        System.out.print("Enter your Credit Score (0 - 500): ");
        int creditScore = scanner.nextInt();

        System.out.print("Enter your Monthly Salary (in BDT): ");
        double salary = scanner.nextDouble();

        System.out.print("Do you have any Criminal Record? (true/false): ");
        boolean hasCriminalRecord = scanner.nextBoolean();

      
        boolean goodCredit = creditScore >= 300;   
        boolean highSalary = salary >= 40000;      
        boolean criminalClear = !hasCriminalRecord;

        if (goodCredit && highSalary && criminalClear) {
            System.out.println("\n You are eligible for the loan. Calculating mortgage...\n"); 

            double monthlyInterestRate = (annualInterestRate / 100) / 12; 
            int numberOfPayments = years * 12;

            double mortgagePayment = principal *
                    (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                    / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

            double totalPayment = mortgagePayment * numberOfPayments;
            double totalInterest = totalPayment - principal;

            Locale bdLocale = Locale.of("en", "BD");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(bdLocale);

            System.out.println("Loan Amount: " + currencyFormatter.format(principal));
            System.out.println("Monthly Payment: " + currencyFormatter.format(mortgagePayment));
            System.out.println("Total Payment: " + currencyFormatter.format(totalPayment));
            System.out.println("Total Interest: " + currencyFormatter.format(totalInterest));
        }
        else {
            System.out.println("\n Sorry, you are NOT eligible for the loan.");
        } 
    
        scanner.close();
    }
}


