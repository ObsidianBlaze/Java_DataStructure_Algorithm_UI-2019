package exercises;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args){
        //Creating the random values of scissors, rock, paper 0,1,2 respectively.
        int comp_guess = ((int) (Math.random()*3));
        System.out.println("Enter a guess from 0,1,2. Scissors, Rock or Paper.");
        Scanner input = new Scanner(System.in);
        int user_guess = input.nextInt();
        
        if(user_guess == 0 && comp_guess == 1){
            System.out.println("You Won, You are Scissors and computer is "+ comp_guess);
        }
        else if(user_guess == 1 && comp_guess == 0){
            System.out.println("You Won, You are rock and computer is " + comp_guess);
        }
        else if(user_guess == 2 && comp_guess == 1){
            System.out.println("You Won, You are Paper and computer is "+ comp_guess);
        }
        else{
            System.out.println(comp_guess + "   " + user_guess);
        }
    }
    
}
