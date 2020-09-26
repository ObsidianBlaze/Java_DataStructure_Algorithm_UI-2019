
import java.util.Scanner;

public class RandomCharacter {
    public static void main(String[] args){
        int t = 97+ (int)(Math.random()* 26);
        char character = (char) t;
        System.out.println(character);
        String name = "Adebisi Ayin said";
        String S1 = " d";
        
        System.out.println(name.equals(S1));
        
        Scanner input = new Scanner(System.in);
        System.out.println("INput two states");
        System.out.println("State one");
        String state1 = input.nextLine();
        
        System.out.println("State two");
        String state2 = input.nextLine();
        
        System.out.println(state1.compareTo(state2) < 0 ? "The state arranged are " + state1 + " " + state2 : "The state arranged are " + state2 + " " + state1);
        
        
     
        }    
}