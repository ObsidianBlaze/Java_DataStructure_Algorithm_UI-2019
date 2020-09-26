package craps;

/**
 *
 * @author user
 */
public class Crap {

    static int die1 = 0;
    static int die2 = 0;
    static int sum;

    public static void roll() {
        //Creating a randomizer.
        die1 = (int) (1 + Math.random() * 6);
        die2 = (int) (1 + Math.random() * 6);

        sum = die1 + die2;

//        System.out.println(die1 + " " + die2 + " " + sum);
//        return sum;
    }

    public static void main(String[] args) {
        roll();
        //Creating the sum of the two dies.

        System.out.println(die1 + " " + die2 + " " + (die1 + die2));

        //calling the randomizer method.
        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you lose.");
        } else if (sum == 7 || sum == 11) {
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you win");
        } else if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
            int point = sum;
            System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " your point is = " + point);
            roll();
            while (true) {
                if (point == sum) {
                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you win");
                    break;
                } else if (sum == 7) {
                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum + " you lose");
                    break;
                } else {
                    System.out.println("You rolled " + die1 + " + " + die2 + " = " + sum);
                    roll();
                }

            }
        }

    }
}
