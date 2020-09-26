package exercises;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Occurence {

    Scanner input;

    public static void main(String[] args) {
        ArrayList<Integer> value = new ArrayList<>();
        value.add(4);
        value.add(3);
        value.add(7);
        value.add(3);
        value.add(23);

//        System.out.println(value.size());
        
        for(int i = 0; i < value.size(); i++){
            System.out.println(value.get(i));
            
        }


//        ListIterator listIterator = value.listIterator();
//        while (listIterator.hasNext()) {
//        }

//         int index = 0;
//         for(int a : value){
//            System.out.println(a + " " + index);
//            index++;
//         
//         }

//Using lambdas to iterate with a for each loop
//        value.forEach((a) -> {
//        });
    }
}
