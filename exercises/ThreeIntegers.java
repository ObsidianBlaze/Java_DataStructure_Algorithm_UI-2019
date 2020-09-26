package exercises;
import java.util.Scanner;

public class ThreeIntegers {
    public static void main(String[] args){
        System.out.println("Program to sort three integers in non-decreasing order");
        System.out.println("E.G: A = 51, B = 46, C = 13. Would return 13,46,51");
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Inupt A");
        int a = input.nextInt();
        
        System.out.println("Inupt B");
        int b = input.nextInt();
        
        System.out.println("Inupt C");
        int c = input.nextInt();
        System.out.println(" ");
        
        System.out.println("The Result Is: ");
        if(a < b && a < c){
            System.out.println(a);
            if(b < c){
                System.out.println(b);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(b);
            }
        }
        
        if(b<a && b<c){
            System.out.println(b);
            if(a < c){
                System.out.println(a);
                System.out.println(c);
            }
            else{
                System.out.println(c);
                System.out.println(a);
            }
        }
        
        if(c<a && c<b){
            System.out.println(c);
            if(a < b){
                System.out.println(a);
                System.out.println(b);
            }
            else{
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
