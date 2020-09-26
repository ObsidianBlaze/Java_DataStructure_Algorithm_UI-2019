public class PalindromePlay {

    public static void main(String[] args){
    //Working with StringBuffer
        /*StringBuffer sb = new StringBuffer("1234");
        System.out.println(sb);
        System.out.println(sb.reverse());
        
        if(sb.reverse().equals(sb))
            System.out.println("Palindrome B");
        */
        
    //Reversing and checking for palindrome
        String word = "020";
        String reverse = "";
        for(int i = word.length(); i > 0; i--){
            char t = word.charAt(i-1);
            reverse += t;
        }
        if(reverse.equals(word))
        System.out.println("Palindrome.");
        else{
            System.out.println("Not palindrome");
        }
    

    //Type casting
 /*
        int number = 020;
        String value = Integer.toString(number);
        String re = "";
        for(int i = value.length(); i > 0; i--){
            char t = value.charAt(i-1);
            re += t;
        }
        if(re.equals(value))
        System.out.println("Palindrome.");
        else{
            System.out.println("Not palindrome");
        }
  */      
        
    }

    
}
