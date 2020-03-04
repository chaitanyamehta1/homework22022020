package homework29022020;
    /*
Read 10 numbers from the console entered by the user and print the sum of those numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number•. Continue reading until you have read 10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message •Enter number #x:• where x represents the count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be •Enter number #1:•, the next •Enter number #2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class No1SumOfNumbers {


    public static void main(String[] args) {//main method
        reading();//calling static method in main method
    }

    public static void reading() {//static method
        Scanner scanner = new Scanner(System.in);//scanner class
        //local variable
        int a = 1;
        int sum = 0;

        while (a <= 10) {//while loop

            System.out.println("Enter number " + a);//printing statement
            boolean hasNextInt = scanner.hasNextInt();
            a++;

            if (hasNextInt) {//if condition
                int number = scanner.nextInt();
                sum += number;


            } else {//else condition
                System.out.println("Invalid Value");//printing statement
            }
            scanner.nextLine();
        }
        System.out.println("Your sum is: " + sum);//printing statement
        scanner.close();//scanner closed

    }


}




