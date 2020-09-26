package exercises;

import java.util.Scanner;

/*
(Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number.

Here is a sample run:
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25
 */
public class Positive_Negative {

    public static void main(String[] args) {
        int POSITIVE = 0;
        int NEGATIVE = 0;
        //Accepting the users input.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = input.nextInt();
        if (number == 0) {
            System.out.println("No numbers are entered except 0");
        }
        while (number != 0) {
            System.out.println("Enter an integer");
            number = input.nextInt();

            if (number > 0) {
                POSITIVE++;
            } else if (number < 0) {
                NEGATIVE++;

            } else if (number == 0) {
                System.out.println("The number of positives is " + POSITIVE);
                System.out.println("The number of negatives is " + NEGATIVE);
                break;

            }
        }

    }
}
