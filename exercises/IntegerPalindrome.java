/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.Scanner;
public class IntegerPalindrome {
    
    public static void main(String[] args){
        
        System.out.println("Insert a number to check if it's a palindrome.");
        
        //Accepting the users input.
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        //Making a call to the method.
        isPalindrome(number);

    }
      
    //Method that reverses input.
    public static int reverse(int number){
        //Converting the input to a string
        String value = number+"";
        
        //Reversing the string.
        String reverse = "";
        //Loop to reverse the numbers.
        for(int i = value.length()-1; i>=0; i--){
            reverse = reverse + value.charAt(i);
        }
        //Converting the reversed value to an Integer.
        int newNumber = Integer.parseInt(reverse);
        
        System.out.println(newNumber);

        return newNumber;
    }
    
    //Method to check if the number is palindrome.
    public static boolean isPalindrome(int number){
        //Creating a variable to reverse the input from the user
        int rev = reverse(number);

        //Checking if the reverse number is the same as the given number.
        if(rev == number){
            System.out.println("True");
            return true;}
        
        else{
            System.out.println("False");
            return false;
        }
    }
}
