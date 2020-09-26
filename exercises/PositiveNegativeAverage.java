package exercises;
import java.util.Scanner;
public class PositiveNegativeAverage {

    public static void main(String[] args){
        //Creating a scanner obj.
        Scanner input = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, number;
        double total = 0, newNum = 0;
        System.out.println("Input a value. If value is 0, the input ends.");
        while(true){
        //Taking the value from the users input.
        System.out.println("Input a value");
        number = input.nextInt();
        
        //Logic to increase the positive count if the value is positive.
        if(number > 0){
            positiveCount += 1;
            total += 1;
            newNum += number;
        }
        
        //Logic to increase the positive count if the value is positive.
        if(number < 0){
            negativeCount += 1;
            total += 1;
            newNum += number;
        }
        
        //Logic to end the loop if 0 is inserted.
        if(number == 0){
            total += 1;
            break;    
            }
        }
        System.out.println("Loop existed.");
        
        System.out.println("The total number of number(s) entered is: " + total);
        System.out.println("The total number of positive number(s) is: " + positiveCount);
        System.out.println("The total number of negative number(s) is: " + negativeCount);
        System.out.println("The average of the number(s) is: " + newNum/(total - 1));
    }
    
}
