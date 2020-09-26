import java.util.Scanner;
public class FirstCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String value = input.nextLine();
        
        System.out.println("The length of the value is " + value.length());
        System.out.println("");
        System.out.println("The first character is " + value.charAt(0));
    }
}
