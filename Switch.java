import java.util.Scanner;
public class Switch 
{
    int a,b;
    Scanner input = new Scanner(System.in);
   public int addMethod(){
        System.out.println("Input first number");
        a = input.nextInt();
        System.out.println("Enter second number");
        b = input.nextInt();
        int result;
        result = a + b;
        System.out.println(result);
        int results = addMethod();
        System.out.println("results is hoo" + results);
        return result;
    }
   public void logic(){
       String sign;
       System.out.println("Input Sign");
       sign = input.nextLine();
       switch(sign){
        case "+": addMethod();
    }
   }
    public static void main(String[] args){
        Switch sw = new Switch();
        sw.logic();
    }
}
