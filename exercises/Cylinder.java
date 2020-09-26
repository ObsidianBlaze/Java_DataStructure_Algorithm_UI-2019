package exercises;
import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);

        double area,volume, radius;
        int length;
        
        System.out.println("Input Radius");
        radius = input.nextDouble();
        //Calculating the area
        double pi = Math.PI;
        double radSqr = radius * radius;
        area = radSqr * pi;
        System.out.println("Input length");
        length = input.nextInt();
        //Calculating the volume
        volume = area * length;
        
        System.out.println("The area is " + area);
        System.out.println("The Volume is " + volume);
        
    }
}
