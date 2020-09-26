
public class TotalLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i = i * 2) {
            System.out.println(" ");
            for (int j = 1; j <= i; j = j * 2) {
                System.out.print(j + " ");
            }
//              System.out.println(i);
        }
        System.out.println(" ");
    }

}
