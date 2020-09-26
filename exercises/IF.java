package exercises;
public class IF {
    public static void main(String[] args){
        int count = 4;
    boolean newLine = count % 10 == 0;
        System.out.println(newLine);
        if (count > 5) System.out.println("Hello Count");
        else if (count < 5) System.out.println("Hello Globe");
        
       int num = 2; 
       boolean even = num % 2 == 0;
       if(even)System.out.println("Even");
       else System.out.println("Odd");
    }
}
