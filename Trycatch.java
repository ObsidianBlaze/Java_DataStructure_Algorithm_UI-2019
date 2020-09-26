public class Trycatch {

    public static void main(String[] args){
        int a = 7;
        int b = 3;
        int result;
        try{
            result = a / 0;
        }
        catch(Exception e){
            System.out.println("Exception found");
        }
    }
    
}
