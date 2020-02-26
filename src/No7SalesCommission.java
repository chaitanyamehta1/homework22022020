/*WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */
import java.util.Scanner;

public class No7SalesCommission {
    //main method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner declaration
        System.out.println("Enter Sales ID : ");
        int num = scan.nextInt();

        System.out.println("Sellers name : ");
        String name = scan.next();

        System.out.println("Enter the Basic Salary : ");
        int sal = scan.nextInt();

        System.out.println("Enter the Sales Amount : ");
        int a = scan.nextInt();

        System.out.println("Sales ID : " + num);
        System.out.println("Seller's name : " + name);
        System.out.println("Basic Salary : " + sal);
        System.out.println("Sales Amount :" + a);

        if (a >= 50000) {                // for sales 50000 or more, comm 35%
            System.out.println("Sales Commission : 35%");  // print comm 35%
            System.out.println("Commission Amount :" +(a*35)/100);
        } else if (a >= 30000) {         // for sales 30000 or more, comm 20%
            System.out.println("Sales Commission : 20%"); // print comm 20%
            System.out.println("Commission Amount :" +(a*20)/100);
        } else if (a >= 20000) {        // for sales 20000 or more, comm 10%
            System.out.println("Sales Commission : 10%"); // print comm 10%
            System.out.println("Commission Amount :" +(a*10)/100);
        } else if (a >= 10000) {        // for sales 10000 or more
            System.out.println("Sales Commission : 5%"); // print comm 5%
            System.out.println("Commission Amount :" +(a*5)/100);
        } else if (a>0 && a<9999) {         // for sales under 10000, comm 2%
            System.out.println("Sales Commission : 2%"); // print 2%
            System.out.println("Commission Amount :" +(a*2/100));
        }
    }



}
