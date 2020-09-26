
public class HelloWorld {

//    program to print hello world 10 times with loops. 
    public static void main(String[] args) {
//    using a for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1 + "for");
        }
        System.out.println(""+"\n");
//  using a while loop

        int i = 0;
        while (i < 10) {
            System.out.println(i + 1 + "while");
            i++;
        }
        System.out.println("\n");
        
//  using do while
int j = 0;
        do{
            System.out.println(j + 1 + "doWhile");
            j++;
        }while(j < 10);

    }

}
