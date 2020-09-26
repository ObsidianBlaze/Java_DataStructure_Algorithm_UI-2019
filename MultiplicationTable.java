
public class MultiplicationTable {

    public static void main(String[] args) {
        // Display the table heading
        System.out.println(" Multiplication Table");

        // Display the number title
        System.out.print(" ");
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%4s" + j,"");
        }
        System.out.println("\n—————————————————————————————");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"|");
            for(int j = 1; j <= 10; j++){
                System.out.printf("%4d", j * i);
            }
            System.out.println("");

        }

    }

}
