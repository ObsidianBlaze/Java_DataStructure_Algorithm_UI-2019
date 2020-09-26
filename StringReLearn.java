
public class StringReLearn {

    public static void main(String[] args) {
        String city1 = " Wuhan";
        String city2 = " Rome";
//        char c = city1.charAt(city1.length());
//        System.out.println(c);
int n = '1';
System.out.println(n );

        System.out.println("w".compareTo("W"));
        System.out.println(city1.indexOf("ha"));
        int comparing = city1.compareTo(city2);
        if (comparing == 0) {
            System.out.println(city1 + city2);
            System.out.println("The two cities are equal.");
        } else if (comparing > 0) {
            System.out.println(city2 + city1);

            System.out.println("City 1 is greater");
        } else {
            System.out.println(city1 + city2);

            System.out.println("City 2 is greater");
        }
    }
}
