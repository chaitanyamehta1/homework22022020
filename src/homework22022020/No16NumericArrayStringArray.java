package homework22022020;// Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class No16NumericArrayStringArray {

    public static void main(String[] args) {//main method
        No16NumericArrayStringArray sa = new No16NumericArrayStringArray();
        sa.arrayString();
    }


    public void arrayString() {
        int[] arrays = {1888, 1895, 1865, 1700, 1600, 1500, 1650};//numeric

        String[] arrays1 = {
                "London", "Birmingham", "Surrey", "Coventry", "Sheffield", "Derby", "Exter"};


        System.out.println("Original numeric array : "+ Arrays.toString(arrays));
        Arrays.sort(arrays);
        System.out.println("Sorted numeric array : "+Arrays.toString(arrays));

        System.out.println("Original string array : "+Arrays.toString(arrays1));
        Arrays.sort(arrays1);
        System.out.println("Sorted string array : "+Arrays.toString(arrays1));


    }


}
