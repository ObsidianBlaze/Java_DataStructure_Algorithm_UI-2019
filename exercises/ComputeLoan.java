package exercises;
import java.util.Scanner;
public class ComputeLoan {
    public static void main(String[] args){
        //creating a scanner
        Scanner input = new Scanner(System.in);
        
        //Enter anaual interest rate
        System.out.print("Enter Anual Interest Rate, e.g 7.25%: ");
        double annualInterestRate = input.nextDouble();
        
        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        //Enter number of years
        System.out.print("Enter number of years as an integer. e.g 5: ");
        int numberOfYears = input.nextInt();
        
        //Enter loan amount
        System.out.print("Enter loan amount eg. 157.45: ");
        double loanAmount = input.nextDouble();
        
        //calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
                1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        
        //display results
        System.out.println("The monthly payment is $" +
                (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + 
                (int)(totalPayment * 100) / 100.0);
    }
}
