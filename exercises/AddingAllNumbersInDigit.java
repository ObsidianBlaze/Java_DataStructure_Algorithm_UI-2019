package exercises;
import java.util.Scanner;
public class AddingAllNumbersInDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num, a, b, c, d,e,f,g;
   
           System.out.println("INput any number from 0 - 1000");
            num = input.nextInt();
            a = num % 10;
            b = num / 10;
            c = b % 10;
            d = b / 10;
            e = d % 10;
            f = d / 10;
            g = f % 10;
            System.out.println("The sum is: " + (a + c + e + f));
    }
}
