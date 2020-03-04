package homework22022020;
/*   Write a Java program to test if an array contains a specific value.  */
import java.util.Scanner;

public class No20ArraySpecificValue {

    // declaration of array method

    public static void main(String[] args) {
        array();
    }

    // declaration of user define method

    public static void array() {

        // declaration of array variable


        int n, x, i;

        // Scanner declaration

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the no. of Elements you want in array :");

        n = scan.nextInt();
        int[] a = new int[n];


        System.out.println("Enter all the Elements");

        for (i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("Enter the Elements you want to find : ");
        x = scan.nextInt();

        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Elements found at position :" + (i + 1));
            }

        }

    }


}
