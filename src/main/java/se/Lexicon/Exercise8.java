package se.Lexicon;


/*
8. Write a program which will remove the duplicate elements of a given
array [20, 20, 40, 20, 30, 40, 50, 60, 50].
Expected output: Array: 20 20 40 20 30 40 50 60 50
 Array without duplicate values: 20 40 30 50 60
 */

import java.util.Arrays;

public class Exercise8 {


    public static void main(String[] args) {

        int[] numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int length = numbers.length;

        Arrays.sort(numbers);

        length = removeDoubles(numbers, length);

        for (int i = 0; i < length; i++)
            System.out.print(numbers[i] + " ");


    }

    public static int removeDoubles(int numbers[], int n) {

        //if (n == 0 || n == 1) {
        //    return n;
        //}
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[n - 1];
        for (int i = 0; i < j; i++) {
            numbers[i] = temp[i];
        }
        return j;
    }


}
