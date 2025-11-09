import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Bangladesh Mortgage Calculator (BDT) ===");

        double principal = 0;
        double annualInterestRate = 0;
        int years = 0;
        int creditScore = 0;
        double salary = 0;
        boolean hasCriminalRecord = false;

        while (true) {
            System.out.print("Enter loan amount (Principal in BDT): ");
            if(scanner.hasNextDouble()){
            principal = scanner.nextDouble();
            if(principal > 0) break;
            else System.out.println(" Invalid input! Loan amount must be positive.");
            scanner.next();      
          }
        }

        while (true) {
            System.out.print("Enter annual interest rate (e.g., 8.5 for 8.5%): ");
            if(scanner.hasNextDouble()){
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate > 0 && annualInterestRate <= 100) break;
            else System.out.println(" Invalid input! Interest rate must be between 0 and 100.");
            scanner.next();           
          }
        }
        while (true) {
            System.out.print("Enter loan period (in years): ");
            if(scanner.hasNextInt()){
            years = scanner.nextInt();
            if (years > 0 && years <= 50) break;
            else System.out.println(" Invalid input! Loan period must be between 1 and 50 years.");
            scanner.next(); 
          }
        }
        while (true) {
            System.out.print("Enter your Credit Score (0 - 500): ");
            if(scanner.hasNextInt()){
            creditScore = scanner.nextInt();
            if (creditScore >= 0 && creditScore <= 500) break;
            else System.out.println(" Invalid input! Credit score must be between 0 and 500.");
            scanner.next(); 
          }
        }
        while (true) {
            System.out.print("Enter your Monthly Salary (in BDT): ");
            if(scanner.hasNextDouble()){
            salary = scanner.nextDouble();
            if (salary > 0) break;
            else System.out.println(" Invalid input! Salary must be positive.");
          scanner.next(); 
          }
        }


        boolean validInput = false;
        while (!validInput) {
            System.out.print("Do you have any Criminal Record? (true/false): ");
            if (scanner.hasNextBoolean()) {
                hasCriminalRecord = scanner.nextBoolean();
                validInput = true;
            } else {
                System.out.println(" Invalid input! Please enter 'true' or 'false'.");
                scanner.next(); 
            }
        }

        boolean goodCredit = creditScore >= 300;  
        boolean highSalary = salary >= 40000;      
        boolean criminalClear = !hasCriminalRecord;

        if (goodCredit && highSalary && criminalClear) {
            System.out.println("\n You are eligible for the loan! \n");

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

        } else {
            System.out.println("\n Sorry, you are NOT eligible for the loan.");
            if (!goodCredit)
                System.out.println("- Credit score too low (need 300+).");
            if (!highSalary)
                System.out.println("- Salary too low (need at least 40,000 BDT).");
            if (!criminalClear)
                System.out.println("- Criminal record detected.");
        }

        scanner.close();
    }
  }
