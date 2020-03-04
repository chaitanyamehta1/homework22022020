package homework22022020;

import java.util.Scanner;

// Write a program that tells us input value is number or an alphabet or symbol.


public class No12NumberAlphabetSymbol {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Input Value :");
        char ch = scan.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number");

        } else {
            System.out.println(ch + " is a Symbol");

        }




    }


}
