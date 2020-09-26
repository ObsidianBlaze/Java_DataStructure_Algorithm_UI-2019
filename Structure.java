// importing useful classes.
import java.util.Scanner;
//creating the class
public class Structure {
    //creating an object for the Scanner class to accept users input
    Scanner input = new Scanner(System.in);
    int num1, num2;
    
    public Structure(){
        //accepting a range of input to add, subtract, divide or multiply two numbers
        Scanner n = new Scanner(System.in);
        int num;
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Input a number.");
        System.out.println("--------- Press 1 for addition --------");
        System.out.println("--------- Press 2 for subtraction ------");
        System.out.println("--------- Press 3 for division ---------");
        System.out.println("--------- Press 4 for multiplication ---");
        System.out.println("========= Press 5 to quit ==============");
        num = n.nextInt();
        if(num == 1){
            this.add();
        }
        else if(num == 2){
            this.sub();
        }
        else if (num == 3){
            this.divide();
        }
        else if(num == 4){
            this.multiply();
        }
        else if (num == 5){
            System.out.println("Exited");
           System.exit(0);
        }
        else{
            System.out.println("Your input is out of range.");
            Structure obj = new Structure();

        }
    }
    
    //creating the method for addition
    public int add(){
        //declaring the variables.
        System.out.println("Input two Numbers to be added up");
        System.out.println("################################");
        //accepting the users inputs
        System.out.println("Input first number");
        num1 = input.nextInt();
        System.out.println("Input second number");
        num2 = input.nextInt();
        int sum;
        sum = num1 + num2;
        System.out.println("The value after adding is " + sum);
        Structure obj = new Structure();  
        return (sum);
        
        
    }
    //creating the method for subtraction.
    public int sub(){
        System.out.println("Input two Numbers to be subtracted");
        System.out.println("##################################");
        System.out.println("Input first number");
        num1 = input.nextInt();
        System.out.println("Input second number");
        num2 = input.nextInt();
        int sub;
        sub = num1 - num2;
        System.out.println("The value after subtracting is " + sub);
        Structure obj = new Structure();  

        return (sub);
    }
    //creating the method for division.
    public float divide(){
        System.out.println("Input two Numbers to be divided");
        System.out.println("##################################");
        System.out.println("Input first number");
        num1 = input.nextInt();
        System.out.println("Input second number");
        num2 = input.nextInt();
        float div ,rem;
        div = num1 / num2;
        rem = num1 % num2;
        System.out.println("The value after dividing is " + div + " the remainder is " + rem);
        Structure obj = new Structure();
        return (div);
    }
    //creating the method for division.
    public int multiply(){
        System.out.println("Input two Numbers to be multiplied");
        System.out.println("##################################");
        System.out.println("Input first number");
        num1 = input.nextInt();
        System.out.println("Input second number");
        num2 = input.nextInt();
        int mul;
        mul = num1 * num2;
        System.out.println("The value after dividing is " + mul);
        Structure obj = new Structure();  
        return (mul);
    }


public static void main(String[] args){
    Structure obj = new Structure();
}
}
