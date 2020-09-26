package game;
public class Expression {
public static void main(String[] args){
    double a = 6.5;
            a += a + 1;
            System.out.println(a);
            a = 6;
            a /= 2;
            System.out.println(a);
            int x, y;
            x = 6;
            y = x++;
            System.out.println(x);
            System.out.println(y);
            x = 6;
            y = ++x;
            System.out.println(x);
            System.out.println(y);
            System.out.println((int)12.5);
            //casting a double to an integer
            double d = 5.1;
            x = (int)d;
            System.out.println(x);
            //casting a float to an integer
            float f = 12.5F;
            int i = (int)f;
            System.out.println(f);
            System.out.println(i);
}    
}
