package homework29022020;
/*
Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message •Enter number: •
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class No2MinimumAndMaximumNumber {


    public static void main(String[] args) {//main method
        min();//calling static method to main method
    }

    public static void min() {//static method

        Scanner scanner = new Scanner(System.in);//scanner class

        //local variable
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {//while loop
            System.out.println("Enter number (to exit enter any litter): ");//printing statement
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {//if condition

                int number = scanner.nextInt();
                if (first) {//if condition
                    first = false;
                    min = number;
                    max = number;

                }
                if (number > max) {//if condition
                    max = number;
                }
                if (number < min) {//if condition
                    min = number;
                }
            } else {//else statement
                break;
            }
        }

        System.out.println("min= " + min + ", max=" + max);//printing statement
        scanner.close();//scanner closing
    }


}




