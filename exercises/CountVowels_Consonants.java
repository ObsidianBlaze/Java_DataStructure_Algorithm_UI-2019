package exercises;

public class CountVowels_Consonants {

    public static void main(String[] args) {

        int vowel = 0;
        int consonant = 0;
        String word = "Programming is fun";
        for (int i = 0; i < word.length(); i++) {
            switch (word.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel += 1;

                default:
            }

        }

        System.out.println("The total vowel is " + vowel);

    }

}
