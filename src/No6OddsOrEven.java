/* WAP to input any number and find out if it’s odd or even */

import java.util.Scanner;

public class No6OddsOrEven {
        // main method
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in); // Scanner declaration

        System.out.println("Enter any Number   : ");

        int num = scan.nextInt();
        // if else statement
        if (num % 2 == 0)
        {
            System.out.println(num + " It is Even Number");
        }
        else {
            System.out.println(num + " It is Odd Number");
        }



    }

}
