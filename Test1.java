import java.util.regex.*;
import java.util.Scanner;
public class Test1 {
    
public static void main(String[] args) {
//    int[] list = {1, 2, 3, 4, 5};
//    reverse(list);
//    for (int i = 0; i < list.length; i++)
//    System.out.print(list[i] + " ");
Scanner input = new Scanner(System.in);

    System.out.println("Input your eamil");
    String email = input.nextLine();
boolean bt = Pattern.matches("[a-zA-Z]+@(gmail||yahoo||hotmail).[a-z]+", email);
    System.out.println(bt);
    boolean b = Pattern.matches("[a-zA-Z]+@(gmail||yahoo)[.][a-z]+", "tayo@yahoo.com");
    System.out.println(b);
    Pattern p = Pattern.compile("[a-zA-Z0-9]+@(gmail||yahoo||hotmail)[.][a-z]+");
    Matcher m = p.matcher("toni512@gmail.com");
    boolean v = m.matches();
    System.out.println(v);
    
    
}

public static void reverse(int[] list) {
    int[] newList = new int[list.length];
    for (int i = 0; i < list.length; i++){
    newList[i] = list[list.length - 1 - i];
    }
    list = newList;
    }
}