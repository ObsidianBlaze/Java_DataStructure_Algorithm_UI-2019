public class ReturnGrade{

    public static void main(String[] args) {
//        System.out.println("Grade is " + getGrade(10));
//        System.out.println(upperChar("e"));
//        System.out.println("This would print out a message multiple times.");
//        printValue("ode",5);
        

            System.out.println((int)(Math.random() * 10));
    reverseString("Hell");

    }
//Method to reverse strings.
    public static void reverseString(String message){
    for(int i = message.length()-1; i >= 0; i--){
        String reverse = "";
        char t = message.charAt(i);
        reverse += t;
        System.out.print(reverse);
    }
        System.out.println("");
    }


    public static char getGrade(double score){
        if(score >= 90){
           return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        String s = " <= + += ";
        
        return 'F';
    }
    
    public static String upperChar(String value){
        if(value.length() > 1){
            return "Error";
        }
       return value.toUpperCase();}
       
    public static void printValue(String message, int x){

        for(int i = 0; i < x; i++){
            System.out.println(message);
        }
        
    }
        
        
        
    }
    

