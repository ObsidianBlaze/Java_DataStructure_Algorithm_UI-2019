package game;
import java.util.Scanner;
public class loop {
    public static void main(String[] args){
        int a , count;
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        
        try{a = input.nextInt();
            System.out.println("You have");
            for(int i = a; i>0; i--){
            for(count = i; count>0; count--){
            System.out.print(count);
    }
            System.out.println("");
    }
        }
        catch(Exception e){
            System.out.println("Input only integer numbers");
        }
    char x = 'B', y = 'b', z = 'k';
    z += x + y ;
        System.out.println(z);
    }}