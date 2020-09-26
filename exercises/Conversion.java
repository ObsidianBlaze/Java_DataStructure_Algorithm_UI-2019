package exercises;
import java.util.Scanner;
public class Conversion {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Accepting the Celcius
      System.out.print("Input a degree in Celcuis: ");
      double celcius = input.nextDouble();
      //Type casting celcius to integer
      int celc = (int)celcius;
      //calculating the celius in fahrenheit
      double fahrenheit = (9.0 / 5 * celc + 32);
      System.out.println(celc + " Celcius Is " + fahrenheit + " in fahrenheit");
      
  }  
}
