package homework22022020;/* Input any alphabet from a to f and print their city name accordingly (use if else) any other
        Alphabet should be invalid entry  */

import java.util.Scanner;

public class No8Alphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alphabet;
        System.out.println("Enter any Alphabet between A to F  :  ");
        alphabet = scan.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();

        if (alphabet.equals("a")) {
            System.out.println("City Name is Ahmedabad");
        } else if (alphabet.equals("b")) {
            System.out.println("City Name is Baroda");
        } else if (alphabet.equals("c")) {
            System.out.println("City Name is Chelsea");
        } else if (alphabet.equals("d")) {
            System.out.println("City Name is Delhi");
        } else if (alphabet.equals("f")) {
            System.out.println("City Name is Fremont ");

        } else {
            System.out.println("Alphabet is not Valid");
            scan.close();
        }

    }


}
