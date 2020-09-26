public class ConditionalExpressions {
    public static void main(String[] args){
        int age = 4;
        int ticketPrice = 0;
        System.out.println((age >= 18) ? "Welcome to our site" + (ticketPrice+=5): "Fucker, you are too young! " + (ticketPrice+=7));
    }
}
