package game;

import java.util.Scanner;
public class AdditionQuiz {
    
    public static void main(String[] args){
        //Creating the object for the scanner
        Scanner input = new Scanner(System.in);
        
        //Creating a randomly generated number with System.currentTimeMillis method
        int number1 = (int)(System.currentTimeMillis()%10), number2 = (int) (System.currentTimeMillis() / 7 % 10);
        
        System.out.println(number1 + "+" + number2 + "is ?");
        
        int answer;
        
        answer = input.nextInt();
        
        System.out.println(number1 + "+" + number2 + " = " + answer + " is "+ (number1 + number2 == answer));
        if(answer == number1 + number2){
            System.out.println("Correct answer");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
    
}
