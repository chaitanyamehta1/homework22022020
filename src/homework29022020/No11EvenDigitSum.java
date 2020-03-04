package homework29022020;
    /*
 Even Digit Sum
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */


public class No11EvenDigitSum {


        public static void main(String[] args) {//main method
            System.out.println(getEvenDigitSum(123456789));//calling static method with one parameter
            System.out.println(getEvenDigitSum(252));//calling static method with one parameter
            System.out.println(getEvenDigitSum(-22));//calling static method with one parameter
        }
        public static int getEvenDigitSum(int number) {//return type method with one parameter
            if (number <0) {//if condition
                return -1;
            }
            int finalNumber = 0;//local variable
            while (number >0) { //loop ends when all the numbers have been tested
                if (((number%10)%2) == 0) { //test for the last digit is even
                    finalNumber += number%10; //takes out the last digit
                }
                number /= 10; //takes out last digit to test the next digit
            }
            return finalNumber;
        }
    }


