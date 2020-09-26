package exercises;
import java.util.Scanner;
public class FeetToMeters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double feet = 0.305;
        double meter;
        System.out.println("INput your meter");
        meter = input.nextDouble();
        
        System.out.println("YOur feet to meter is " + meter*feet);
    }
}
