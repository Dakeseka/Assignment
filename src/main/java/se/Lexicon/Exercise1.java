package se.Lexicon;

public class Exercise1 {

    public static void main(String[] args) {
        /*
         * 1. Write a program which will store elements in an array of type ‘int’ and
         * print it out.
         * Expected output: 11 23 39 etc.
         */

        int[] numbers = {12, 23, 34, 45, 56};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( " [" + i + "]:" + numbers[i] + ",");
        }
    }
}
