package craps;
//Instruction
/*
(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player. Here are some sample runs.

You rolled 5 + 6 = 11
You win
You rolled 1 + 2 = 3
You lose
You rolled 4 + 4 = 8
point is 8
You rolled 6 + 2 = 8
You win
You rolled 3 + 2 = 5
point is 5
You rolled 2 + 5 = 7
You lose

 */
public class Craps {

    public static void main(String[] args) {

        //Array of first die
//        int[] die1 = {1, 2, 3, 4, 5, 6};
        //Array of second die
//        int[] die2 = {1, 2, 3, 4, 5, 6};
        while (true) {
//Creating a randomizer.
            int die1 = (int) (1 + Math.random() * 6);
            int die2 = (int) (1 + Math.random() * 6);

            //Creating the sum of the two dies.
            int sum = die1 + die2;

            int point = 0;

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you lose");
                break;
            } else if (sum == 7 || sum == 11) {
                System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you win");
                break;
            } else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                point = sum;
                    if(point == 7){
                        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you lose oh."); 
                        break;
                    }
                    else if(point == sum){
                        System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you win oh.");
                        break;
                    
                    }
            }
//(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
//a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
//Your program acts as a single player. Here are some sample runs.
//You rolled 5 + 6 = 11
//You win
//You rolled 1 + 2 = 3
//You lose
//You rolled 4 + 4 = 8
//point is 8
//You rolled 6 + 2 = 8
//You win
//You rolled 3 + 2 = 5
//point is 5
//You rolled 2 + 5 = 7
//You lose
        }
    }
}
