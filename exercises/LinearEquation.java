package exercises;
import java.util.Scanner;
public class LinearEquation {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //variables to work with
     double a, b, c, d, e, f, x, y, numerator1, numerator2, denomenator1, denomenator2;
        System.out.println("Input the values for A-F respectively");
        System.out.print("A: ");
        a = input.nextDouble();
        System.out.print("B: ");
        b = input.nextDouble();
        System.out.print("C: ");
        c = input.nextDouble();
        System.out.print("D: ");
        d = input.nextDouble();
        System.out.print("E: ");
        e = input.nextDouble();
        System.out.print("F: ");
        f = input.nextDouble();
        
        numerator1 = ((e * d) - (b * f));
        denomenator1 = ((a * d) - (b - c));
        
        numerator2 = ((a * f) - (e * c));
        denomenator2 = ((a * d) - (b * c));
        
        x = numerator1 / denomenator1;
        y = numerator2 / denomenator2;
        
        System.out.println("X is equal to: " + x);
        System.out.println("Y is equal to: " + y);
    }
}
