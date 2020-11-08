package se.Lexicon;

/*
 * 6. Write a program which will set up an array to hold the next values in this
 * order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
 * Expected output: Average is: 17.3
 */

public class Exercise6 {
    public static void main(String[] args) {

        //try to take of the decimals.

        double[] number = {43, 5, 23, 17, 2, 14};
        double total = 0;

        for (int i = 0; i < number.length; i++) {
            total = total + number[i];
        }

        double average = total / number.length;
        System.out.println(average);


    }
}
