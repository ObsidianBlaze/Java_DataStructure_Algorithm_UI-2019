package exercises;
import java.util.Scanner;
public class PentagonArea {
    public static void main(String[] args){

        
        double lengthOfSide, lengthFromCentre, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length from the centre of the vertex: ");
        
        //Inputing the length from the center of the vertex
        lengthFromCentre = input.nextDouble();
        
        lengthOfSide = 2*lengthFromCentre*Math.sin(3.14/5);
        
        area = ((5 * (lengthOfSide * lengthOfSide)) / (4 * Math.tan(3.14/5)));
        
        
        
        System.out.printf("The area of the pentagon is %4.2f", area);
    }
}
