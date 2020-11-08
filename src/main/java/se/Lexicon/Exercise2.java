package se.Lexicon;

import java.util.Arrays;

public class Exercise2 {

    /*
     * 2. Create a program and create a method with name ‘indexOf’ which will
     * find and return the index of an element in the array. If the element
     * doesn’t exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */

    public static void main(String[] args) {
        indexOf();

    }
    public static void indexOf () {
        int[] numbers = {5,7,2,8,5,6};


        int theIndex = Arrays.binarySearch(numbers,6);
        System.out.println("Index position of number is: " + theIndex + ".");
    }

}
