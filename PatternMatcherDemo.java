import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternMatcherDemo {
    public static void main(String[] args){
        
        pattern("09098745895");
        //Creating a pattern
//        Pattern myPattern = Pattern.compile("[a-z 1-9]");
//        
//        //Creating a matcher
//        Matcher myMatcher = myPattern.matcher("2");
//        
//        //Boolean to test if it matches.
//        Boolean myBool = myMatcher.matches();
//        
//        if(myBool)
//            System.out.println("Mathces.");
//        else
//            System.out.println("Does not match");
//    
    }
//    
    public static Boolean pattern(String value){
       Boolean bool = Pattern.matches("[0][7-9][0][0-9]{8}",value);
        System.out.println(bool);
        return bool;
    }
}
