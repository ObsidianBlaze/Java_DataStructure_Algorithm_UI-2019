
import java.awt.Toolkit;

public class Nofe {
    
    public static void main(String[] args){
                //type casting 11.56 to 1156
                //E+2 is exponential for moving the deciamal.
             float w = 11.56E2f;
             int hh = (int)w;
             System.out.println(hh);
             
             System.out.println((int)11.56);
                   int cents = (int)(11.56 * 100);
                   System.out.println(cents);
                   System.out.println(4/7.0);
                   System.out.println(Math.random());
                   
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
      int  width=1366,height=768;
                Toolkit.getDefaultToolkit().getScreenSize();
                System.out.println("Loop to print first 10 numbers");
                
                int [] number = {1,2,3,4,5,6,7,8,9,10};
                int total = 0;
                for(int n:number){
                    total = total + n;
                }
                                    System.out.println(total);

                                    System.out.println("Loop to print first 10 numbers without arrays");
                int counter = 0;
                for(int i = 0; i<=10; i++){
                    counter = counter + i;
                }
                System.out.println(counter);
        }
        
        }
        
