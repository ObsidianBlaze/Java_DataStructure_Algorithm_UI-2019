package exercises;
import java.util.Scanner;
//class to format a decimal
import java.text.DecimalFormat;
public class CompoundValue {
    /**
     (Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly interest
rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes
100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)
     * @param args **/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".##");
        int save;
        save = input.nextInt();
        
    double monthly_rate, account_value, firstMonth, secondMonth, thirdMonth, fourthMonth, fifthMonth, sixthMonth;
    monthly_rate =0.00417;
    firstMonth = save * (1 + 0.00417);
    secondMonth = (save + firstMonth) * (1 + 0.00417);
    thirdMonth = (save + secondMonth) * (1 + 0.00417);
    fourthMonth = (save + thirdMonth) * (1 + 0.00417);
    fifthMonth = (save + fourthMonth) * (1 + 0.00417);
    sixthMonth = (save + fifthMonth) * (1 + 0.00417);
    
        System.out.println("After the sixth month, the account value is: " + df.format(sixthMonth));
        
    
    }
}
