
import java.util.Arrays;
import java.util.stream.IntStream;

public class LambdaLoop {
    public static void main(String[] args){
    
        int[] scores = {23,45,43,23};
        String[] names = {"Boy", "Girl", "Man"};
//        for(int i : scores){System.out.println(i);}
       
/*            for(int[] i : scores){
            System.out.println("");
            for(int j : i){
                System.out.print(j);
            }
            
        }
*/
    
        Arrays.stream(names).forEach(x -> System.out.print(x + " "));
        System.out.println(" ");
        
        IntStream.of(scores).forEach(x -> System.out.print(x + " "));
        System.out.println(" ");
        
        IntStream.range(0,scores.length).map(x -> scores[x]).forEach(x -> System.out.print(x + " "));
        System.out.println(" ");


    }
}
