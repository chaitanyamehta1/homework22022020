package homework29022020;

/*
Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */



import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class No9FibonacciNumber {
    public static void main(String[] args) {

        int count = 9, num1 = 0, num2 = 1;
        System.out.println("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}
