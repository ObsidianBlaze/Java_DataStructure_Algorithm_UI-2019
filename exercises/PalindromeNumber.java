package exercises;
import java.util.Scanner;
public class PalindromeNumber {
   public static void main(String[] args){ 
       System.out.println("Program to check if a three digit integer is a palindrome");
       int d1,d2,d3;
       Scanner input = new Scanner(System.in);
       System.out.println("Input First Number");
       d1 = input.nextInt();
       System.out.println("Input Second Number");
       d2 = input.nextInt();
       System.out.println("Input Third Number");
       d3 = input.nextInt();
       
       if(d1 == d3){
           System.out.print(d1+""+d2+""+d3);
           System.out.println(" Is A Palindrome");
       }
       else{
           System.out.print(d1+""+d2+""+d3);
           System.out.println(" Is Not A Palindrome");
       }
   }
}
