package homework22022020;

/* WAP to print the numbers between 1 to 100 which can be divided by 3 and 5
separately */
public class No11Divide3And5 {
    // main method
    public static void main(String[] args) {

        System.out.println("\nDivided By 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }

        System.out.println("\nDivided By 5: ");
        for (int i = 1; i<100; i++){
            if(i%5 ==0)
                System.out.print(i + ",");
        }
    }


}
