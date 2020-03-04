package homework29022020;
/*
 Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So: 1+125+27=153
 */

import java.util.Scanner;

public class No10ArmStrong {
    public static void main(String[] args) {

        int c=0,a,temp;
           int n;//It is the number to check armstrong
        System.out.println("Enter Any Number  : ");
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        scan.close();
           temp=n;
           while(n>0)
               {
                a=n%10;
                n=n/10;
                c=c+(a*a*a);
                }
           if(temp==c)
                System.out.println("armstrong number");
           else
                System.out.println("Not armstrong number");
           }
}


