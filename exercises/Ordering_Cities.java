package exercises;

public class Ordering_Cities {

    public static int recur(int number) {
        if (number == 0) {
            return 0;
        }
        System.out.println(number);
        return recur(number - 1);
    }

    public static void main(String[] args) {
//        String city1 = "Chicago", city2 = "Los Angeles", city3  = "Atlanta";
//        String arranged = "";
//        if(city1.compareToIgnoreCase(city2) < 0 && city1.compareToIgnoreCase(city3) < 0){
//            System.out.println();
//        
//        }
        recur(10);
    }
}
