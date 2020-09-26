/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author user
 */
public class ReverseString {
    
    public static void main(String[] args)
    {
    String a = "Timothy Samuel osas";
    int reversed;
//        System.out.println(a.charAt(3));
        for(int i = 0;i <= a.length()-1;i++ ){
            reversed = a.length();
            System.out.print(a.charAt(reversed-1-i));
        }
        System.out.println("\n");
        
        reverse("Any Name I Want");
        System.out.println(reverse("Tanjiro"));
    }
    
    public static String reverse(String input){
        
        String reversed = "";
        
        for(int i = input.length()-1; i >= 0; i--){
            //Char to hold value from the end of a string;
            char value = input.charAt(i);
            
            //Saving my value of type char into reversed.
            reversed += value;
        }
        System.out.println(reversed);
        return reversed;
    }
}
