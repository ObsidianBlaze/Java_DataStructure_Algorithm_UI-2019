package exercises;

import java.util.Scanner;
import java.util.regex.*;

public class CheckISBN {

    public void run() {

        System.out.println("Program to check ISBN 10");

        Scanner input = new Scanner(System.in);

        int d1, d2, d3, d4, d5, d6, d7, d8, d9, checksum;
        char df = 'X';
        System.out.println("Enter First Digit");
        d1 = input.nextInt();
        System.out.println("Enter Second Digit");
        d2 = input.nextInt();
        System.out.println("Enter Third Digit");
        d3 = input.nextInt();
        System.out.println("Enter Fourth Digit");
        d4 = input.nextInt();
        System.out.println("Enter Fifth Digit");
        d5 = input.nextInt();
        System.out.println("Enter Sixth Digit");
        d6 = input.nextInt();
        System.out.println("Enter Seventh Digit");
        d7 = input.nextInt();
        System.out.println("Enter Eight Digit");
        d8 = input.nextInt();
        System.out.println("Enter Ninth Digit");
        d9 = input.nextInt();

        checksum = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);
        if (checksum == 10) {
            System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + df);
        } else {
            System.out.println(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + checksum);
        }

    }

    public static void main(String[] args) {
    }
}
