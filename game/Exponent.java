package game;

public class Exponent {
     
public static void main(String[] args){
    //Using the power method from the Math class
    System.out.println(Math.pow(2, 3));
    System.out.println(Math.PI);
    //Finding the hundreth day if the day is tuesday
    System.out.println((2 + 100) % 7);
    System.out.println(25.0/4);
    System.out.println(Math.pow(2, 3.5));
    int m = 2;
    int r = 2;
    double s = m*r;
    System.out.println(Math.pow(s, 2));    
    System.out.println();
    System.out.println((0+3)%12);
    //working with scientific literals
    double d = 1.255E2;
    System.out.println(d);
    System.out.println(123_896);
    
    System.out.println(5.5 * Math.pow(r, 2.5));
    
}    
}
