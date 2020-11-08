package se.Lexicon;

import java.util.Arrays;

/**
 * 7. Write a program which will set up an array to hold 10 numbers and print
 * out only the uneven numbers.
 * Expected output: Array: 1 2 4 7 9 12
 * Odd Array: 1 7 9
 */


public class Exercise7 {

    //Even numbers:
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Even numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ", ");

            }
        }

        System.out.println(" ");
        System.out.print("Uneven numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + ", ");
            }
        }
    }
}
