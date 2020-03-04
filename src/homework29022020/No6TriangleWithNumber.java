package homework29022020;
/*
Write a program in Java to display the pattern like triangle with a number.
        For eg.
        Input number of rows: 10
        Expected Output:
        1
        12
        123
        1234
        12345
        123456
        1234567
        12345678
        123456789
        12345678910 */

import java.util.Scanner;

public class No6TriangleWithNumber {
    public static void main(String args[]) { // Main Method
        System.out.print("Enter The num : ");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        in.close();
        for (int x = 1; x <= a; x++) {  //for loop
            for (int y = 1; y <= x; y++)
                System.out.print(y);
            System.out.println("");
        }
    }

}
