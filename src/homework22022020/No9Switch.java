package homework22022020;

import java.util.Scanner;

public class No9Switch {
    public static void main(String[] args) {
        String alphabet;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F   :  ");
        alphabet = Scan.next();
        alphabet = alphabet.toUpperCase();
        alphabet = alphabet.toLowerCase();

        switch (alphabet){
            case "a" :
                System.out.println("City Name is Ahmedabad");

                break;
            case  "b" :
                System.out.println("City Name is Baroda");
                break;
            case "c" :
                System.out.println("City Name is Chlesea");
                break;
            case "d" :
                System.out.println("City Name is Delhi");
                break;
            case "f":
                System.out.println("City Name is Fremont");
            default:
                System.out.println("City Name is Not Valid");


        }


    }

}
