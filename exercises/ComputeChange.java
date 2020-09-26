package exercises;
import java.util.Scanner;
public class ComputeChange {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Prompting the user to enter an amount as decimal e.g 11.56
      System.out.println("Input amount in form of decimal. e.g 11.56");
      double amount = input.nextDouble();
      
      //Converting amount to cents holding integers
      int cents = (int)(amount * 100);
      
      //Finding the number of dollars
      int dollars = cents / 100;
      
      //Finding the reamianing cents
      int remianingCents = cents % 100;
      
      //Finding the amount of quaters
      int quaters = remianingCents / 25;
      
      //Remaining cents after finding quater
      remianingCents = remianingCents % 25;
      
      //Finding the dimes
      int dime = remianingCents / 10;
      
      //Remaining cents after finding dimes
      remianingCents = remianingCents % 10;
      
      //Finding Nickles
      int Nickles = remianingCents / 5;
      
      int pennies = remianingCents % 5;
      
      //Displaying results
      System.out.println("Your amount " + amount + " consists of");
      System.out.println(" " + dollars + " dollars");
      System.out.println(" " + quaters + " quaters");
      System.out.println(" " + dime + " dimes");
      System.out.println(" " + Nickles + " Nickles");
      System.out.println(" " + pennies + " Pennies");
  }  
}
