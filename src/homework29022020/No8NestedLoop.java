package homework29022020;

/*
 Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */


import java.util.Scanner;

public class No8NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");

            }
            System.out.println();
        }

    }
}

