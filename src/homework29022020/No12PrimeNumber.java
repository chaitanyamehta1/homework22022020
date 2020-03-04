package homework29022020;

/* Write a programme to input any number and check if it is prime number or not. */

import java.util.Scanner;

public class No12PrimeNumber {

    public static void main(String args[]){
        int i,m=0,flag=0;
        int n;//it is the number to be checked
        System.out.println("Enter Any Number  : ");
        Scanner scan = new Scanner(System.in);
        n= scan.nextInt();
        m=n/2;
        scan.close();
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;

                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }


}
