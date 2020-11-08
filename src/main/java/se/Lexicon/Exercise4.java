package se.Lexicon;

import java.util.Arrays;

public class Exercise4 {

    /*
        4. Write a program which will copy the elements of one array into another
        array.
        Expected output: Elements from first array: 1 15 20
        Elements from second array: 1 15 20
     */


    public static void main(String[] args) {
        copyArrays();

    }

    public static void copyArrays() {



        int[] firstArray = {1, 15, 20};
        int[] secondArray = Arrays.copyOf(firstArray, 3);

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");

        }
        System.out.print(Arrays.toString(secondArray));
    }
}
