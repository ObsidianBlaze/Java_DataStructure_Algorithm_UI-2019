
public class LetterFinder {

    public static void main(String[] args) {

        String value = "My name is osas";
        int counter = 0;
        for (int i = 0; i < value.length(); i++) {
            Character c = value.charAt(i);
            String d = c.toString();
            if (d.equalsIgnoreCase("a")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
