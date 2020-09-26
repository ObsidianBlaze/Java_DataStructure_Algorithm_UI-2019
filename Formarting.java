public class Formarting {
    public static void main(String[] args){
    double interest = 16.404674;
    System.out.printf("Hello #%4.2f",interest);
    System.out.println();
    System.out.printf("%f name is %s", interest, "boy");
    System.out.println("");
        
        
float height = 254.43f;
String name = "tayo";
char sex = 'm';
int to = 3;
String fd = Integer.toString(to);
int news = Integer.parseInt(fd);
        System.out.println(news);
        System.out.println(fd);
        System.out.printf("The height is %3.1f and the name is %s and sex is %-5c and to is %d",height,name,sex,to);
        
        
        
    }
}