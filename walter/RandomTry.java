package walter;

import java.math.BigInteger;

public class RandomTry {

    public static void main(String[] args) {
        int rand = 1;
        int counter = 1;
        int[] h = {9,8,7,6,5,4,3,2,1};
        System.out.println(h[(0 + h.length-1) / 2]);
/*
        while(counter < 100){
            rand = (rand*121) % 1000;
            counter = counter+1;
            System.out.println(rand);
        }
*/
    }
}
