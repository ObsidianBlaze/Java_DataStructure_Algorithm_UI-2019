package exercises;

import java.util.Scanner;

public class Vowel_Consonant_Checker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//65 - 122
//        int value = input.nextInt();
        System.out.println("Enter a letter");
        String letter = input.nextLine();
        boolean checker = letter.equalsIgnoreCase("a")
                || letter.equalsIgnoreCase("e")
                || letter.equalsIgnoreCase("i")
                || letter.equalsIgnoreCase("o")
                || letter.equalsIgnoreCase("u");
        char let = letter.charAt(0);
        boolean checking = let >= 65 && let <= 122 ;
        if (checking) {
            if (checker) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not a letter");
        }
    }
}
