package game;

import java.util.Scanner;
public class Reverse {
public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Input your word to be read from back");
       String word,reverse;
       word = input.nextLine();
       reverse = "";
       //using a loop to iterate through each letters
       for(int i = word.length() - 1; i >= 0; i--){
           reverse = reverse + word.charAt(i);
       
       }
       System.out.println("The resulting reversed word is:");
       System.out.println(reverse);
}    
}
