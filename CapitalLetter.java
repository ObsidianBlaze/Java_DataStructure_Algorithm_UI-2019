
public class CapitalLetter {

    public static void main(String... args) {
        char value = 'Z';
        System.out.println(checker("xOy"));
//        checker("GIRL");
    }

    public static boolean checker(String word) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (letters[i] >= 65 && letters[i] <= 90) {
                if (letters[i + 1] >= 65 && letters[i + 1] <= 90) {
                    return false;
                }
                return true;

            }
        }
        return false;
    }
}
/*Algorithm
    If it starts with a capital letter.
    If it has no capital at all.
    If it is all caps.
>=65 <=90
*/
