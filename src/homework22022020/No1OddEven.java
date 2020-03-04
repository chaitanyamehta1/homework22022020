package homework22022020;/* Write a java program that tell us that Input number is odd or even?
HINT: use turnery operator (? : */


import java.util.Scanner;

public class No1OddEven {
        // main method declaration
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // declaration of Scanner
        System.out.println("Enter any Number : "); // Print line
        int num = scan.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd"; // formula

        System.out.println(num + " is " + evenOdd); // print answer
        scan.close();

    }



}
