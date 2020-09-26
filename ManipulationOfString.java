public class ManipulationOfString {

    public static void main(String[] args) {
        String name = "Bolly Wood Aging", first, last;
        int space = name.indexOf(" ");
        first = name.substring(0,space);
        last = name.substring(space + 1);
        System.out.println(first+last);
        first.equalsIgnoreCase(first);

        
        int a = 4;
        String b = Integer.toString(a) + "l";
        String c = a+"l";
        System.out.println(1 + "Welcome" + ('\u0001' + 1));
    }
    
}
