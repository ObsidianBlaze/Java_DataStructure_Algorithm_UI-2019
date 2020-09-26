//Program to find the prime numbers from 0 to 100

public class Prime {
//Creating the main method

    public static void main(String[] args) {
        //Loop to iterate over the 100 numbers
        for (int i = 0; i <= 100; i++) {
            //Variable to hold the prime numbers.
            String primeNumbers = "";
            //Boolean checker to ensure that the single digit prime numbers are inclusive.
            boolean prime = i == 2 || i == 3 || i == 5 || i == 7 || i == 9;
            //Checking if you get a whole number as a remainder after dividing by the single digit prime
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && i % 9 != 0 || prime) {
                //Appending the prime numbers to the string variable.
                primeNumbers += i;
                //Adding an extra white space after each checked prime.
                System.out.print(primeNumbers + " ");
            }
        }
        System.out.println("");
    }
}
