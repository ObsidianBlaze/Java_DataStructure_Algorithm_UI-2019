package exercises;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args){
        
        System.out.println("Input Password.");
        Scanner input = new Scanner(System.in);
        
        String test = input.nextLine();
        
        checkPassword(test);
//          checkPasswordMatches(test);
        
    
    }
    
//Creating the method to validate the password.
    public static void checkPassword(String password){
        
        if(password.length() >= 8){
            checkPasswordMatches(password);
        }
        else
            System.out.println("Password should be longer than 8, Invalid password.");
        
    
    }
    
    public static Boolean checkPasswordMatches(String password){
    
        //Creating a pattern
        Pattern myPattern = Pattern.compile("[a-z 1-9 A-Z]{1,20}");
        
        //Creating a matcher
        Matcher myMatcher = myPattern.matcher(password);
        
        //Boolean to test if it matches.
        Boolean myBool = myMatcher.matches();
        
        if(myBool){
            System.out.println("Valid Password.");
            return true;}
        else{
            System.out.println("Invalid Password.");
            return false;
        }
    }
}
