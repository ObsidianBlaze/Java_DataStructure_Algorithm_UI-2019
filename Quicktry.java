public class Quicktry {
    public static void main(String[] args) {
        String s1 = " Welcome ", s2 = " welcome ";
        
        boolean isEqual;
        
        isEqual = s1.equals(s2);
        
        //checking if the two instancies of both s1 && s2 are even.
        System.out.println(isEqual);
        
        //Checking if the two instancies are equal and ignoring cases.
        isEqual = s1.equalsIgnoreCase(s2);
        System.out.println(isEqual);
        
        //Comparing s1 and s2 and putting it in an int variable x.
        int x;
        
        x = s1.compareTo(s2);
        System.out.println(x);
        
        //Checking if instance s1 has a prefix AA
        boolean b;
        b = s1.startsWith("AA");
        System.out.println(b);
        
        //Assigning first character of s1 to a char y
        char y;
        y = s1.charAt(1);
        System.out.println(y);
        
        
        //Trying a while loop.
        int sum = 0, i = 1;
        while (i < 10) {
        sum = sum + i;
        i++;
                        }
        System.out.println(sum);
    
        for(int j = 0; j < 10; j++)
            System.out.println("Slim Shady Baby! " + j); 
        
        
long tum = 0;
for (int p = 0; p <= 1000; p++)
tum = tum + p;
        System.out.println(tum); 
        
        
    long t = 0;
    int g = 0;
    while(g <= 1000){
        t = t + g;
        g++;
    }
            System.out.println(t);


            
            int wo = 3;
            do{
                System.out.println(wo);
                wo++;
            }while(wo < 10);

        
    }
    
    
    
}
