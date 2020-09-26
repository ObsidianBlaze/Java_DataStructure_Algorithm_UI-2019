import java.util.Scanner;
public class Play {
    public static int add(int a, int b){
        
        int sum = a + b;
    
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INput value A");
        int a = input.nextInt();
        
        System.out.println("Input value B");
        int b = input.nextInt();
        int c = add(a , b);
        
        System.out.println(c);
    }
    
}
