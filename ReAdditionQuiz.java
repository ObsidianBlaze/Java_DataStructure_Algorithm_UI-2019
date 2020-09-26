
import java.util.Scanner;

public class ReAdditionQuiz {

    //Making the functionality
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10);
        int secondNumber = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + firstNumber + " + " + secondNumber);

        //Accepting the users input
        int answer = input.nextInt();
        while (answer != firstNumber + secondNumber) {
            System.out.println("Wrong answer");
            System.out.println("What is " + firstNumber + " + " + secondNumber);
            answer = input.nextInt();
        }
        //If answer is correct
        System.out.println("You are right! " + firstNumber + " + " + secondNumber + " = " + answer);

    }
}
