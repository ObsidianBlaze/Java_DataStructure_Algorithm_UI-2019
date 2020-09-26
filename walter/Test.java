package walter;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        final int N = 10000000;
        int[] array = new int[N];
        // fill array at random
        Random rng = new Random();
        for (int counter = 0; counter < 100; counter++) {
            array[counter] = rng.nextInt(100);
            System.out.println(counter + " " + array[counter]); // for testing
        }
        int target = 1234567; // search
        long startTime = System.nanoTime();
        for (int counter = 0; counter < N; counter++) {
            if (array[counter] == target) {
                System.out.println("Found at" + counter);
                System.out.println((System.nanoTime() - startTime) / 1000000 + " milliseconds");
                return;
            }
        }
        System.out.println("Not present");
        System.out.println((System.nanoTime() - startTime) / 1000000 + " milliseconds");
    }
}
