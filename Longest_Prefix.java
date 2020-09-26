public class Longest_Prefix {
public static void main(String[] args) {
 String a = "aWelcome to C++";
 String b = "Welcome to programming";
// int totalMatch = 0;
 String nothing = "";
 String common = "";
 
 for(int i = 0; i < a.length(); i++){
     if(a.charAt(i) == b.charAt(i)){
//         totalMatch++;
         common+=a.charAt(i);
     }
     else{
         nothing = "Nothing in common";
     }
 }
     System.out.println("Atlanta and Macon have no common prefix");
 if(common.equals(""))
    System.out.println(nothing);
}
    
}
