package game;
import java.util.Scanner;
public class SubtractionQuiz {
       public static void main(String[] args){
           Scanner input = new Scanner(System.in);
           System.out.println("Program to randomly print out two numbers and user subtracts.");
           int number1, number2;
           //creating and storing a class that randomly generates a double. cast the double to int
           number1 = (int)(Math.random() * 10);
           number2 = (int)(Math.random() * 10);
           
           System.out.println((int)(Math.random() * 10));
           //Checking if the first number is lesser than second. If so, swapping it.
           if(number1 < number2){
               int temp = number1;
               number1 = number2;
               number2 = temp;
           }
           System.out.println("What is " + number1 + " - " + number2 + " ?");
           int answer;
           answer = input.nextInt();
           if(answer == number1 - number2){
               System.out.println("Correct");
           }
           else{
               System.out.println("Wrong Answer! the answer is " + (number1 - number2));
           }
       }
}
