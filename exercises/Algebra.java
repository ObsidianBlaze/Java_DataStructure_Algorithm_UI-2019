package exercises;
import java.util.Scanner;
public class Algebra {
    public static void main(String[] args){
        System.out.println("Program that obtains and displays two roots of an equation.");
        System.out.println("ax^2 + bx + c = 0");
       
        //Creating the variables to be manipulated
        Scanner input = new Scanner(System.in);
        double a, b, c, x, root, r1, r2;
        System.out.println("Input A");
        a = input.nextDouble();
        System.out.println("Input B");
        b = input.nextDouble();
        System.out.println("Input C");
        c = input.nextDouble();
        //x holds the root of the equation
        x = ((b * b) - (4 * a * c));
        //root holds the square root of x
        root = Math.pow(x , 0.5);
        //finding the whole equation
        r1 = ((-b + root) / (2*a));
        r2 = ((-b - root) / (2*a));
        
        if(x > 0){
            System.out.println(r1);
            System.out.println(r2);
        }
       else if(x == 0){
            System.out.println(r1);
        }
        else{
            System.out.println("The Equation Has No Real Roots.");
        }
    }
}
