package homework22022020;/* WAP to input any year like (ex.2007) and find out if it is leap year or not? */


import java.util.Scanner;

public class No2LeapYear {

    // main method declaration
    public static void main(String[] args) {

        // instance variable
        int year, remainder;
        // declaration of Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Year :  ");
        year = input.nextInt();
        remainder = year % 4;
        // if else statement declaration
        if (remainder==0){
            System.out.println("It is a Leap Year");
            input.close();
        }
            else {
            System.out.println("It is not a Leap Year");
        }
    }
}