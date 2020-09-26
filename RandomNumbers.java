import java.util.Scanner;
public class RandomNumbers {

    public static void main(String[] args){
        System.out.println((int)(Math.random()*5));
        
        Scanner input = new Scanner(System.in);
    
    int a,b,temp;
        System.out.println("Program to swap variables");
    
        System.out.println("Input number for a");
        a = input.nextInt();
        System.out.println("Your a is " + a);
        System.out.println("Input number for b");
        b = input.nextInt();
        System.out.println("Your b is " + b);
        
        System.out.println("The swapped values become...");
        
        temp = a;
        
        a = b;
        
        b = temp;
        
        System.out.println("Your swapped values for a is " + a +" and b is " + b);
    }
   
}
