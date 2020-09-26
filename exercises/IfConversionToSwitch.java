package exercises;
public class IfConversionToSwitch {
    
    public static void main(String[] args){
        int x = 1, a = 3;
        switch(a){
            case 1: System.out.println( x += 5); break;
            case 2: System.out.println( x += 10); break;
            case 3: System.out.println( x += 16); break;
            case 4: System.out.println( x += 34); 
        }
    }
    
}
