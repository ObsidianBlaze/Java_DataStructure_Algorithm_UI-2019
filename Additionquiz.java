import java.util.Scanner;
public class Additionquiz {
    public static void main(String[] args) {
        //Creating an input
        Scanner input = new Scanner(System.in);
        //Generating random numbers
        int number1 = ((int) (Math.random()*10)), number2 = ((int) (Math.random()*10));
        
        
        System.out.println( "What is " + number1 + "+" + number2);

        //Accept users input
        int answer = input.nextInt();

        
        //Run a loop to check if the answers are correct.
        while(number1+number2 != answer){
            System.out.println("Your answer is wrong.");
            
            System.out.println( "What is " + number1 + "+" + number2);
            
            answer = input.nextInt();
        }
        
        System.out.println("Correct!");
    }
    
}
