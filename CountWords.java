public class CountWords {

    public static void main(String[] args){
    
        java.util.Scanner in = new java.util.Scanner(System.in);
        
        
        System.out.println("Input a new sentence.");
        String word = in.nextLine();
//        String word = "      Word  jkm  kkmm";

        String [] ar = word.split("[ ]+");
        
        
        int value = ar.length;
        
        if(word.startsWith(" ")){
        value -= 1;
        System.out.println(value);
        }
        else{
            System.out.println(value);
        }
        
        
    
    }
    
}
