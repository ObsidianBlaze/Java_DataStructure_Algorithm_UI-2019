package exercises;
import java.util.Scanner;
public class GameHeadTail {
    public static void main(String[] args){
        int coinflip, guess;
        coinflip = (int)(Math.random()*2);
        Scanner input = new Scanner(System.in);
        System.out.println("Input Your Guess");
        guess = input.nextInt();
        if(guess == coinflip){
            System.out.println("Right Guess.");
        }
        else{System.out.println("Wrong Guess");}
    }
}
