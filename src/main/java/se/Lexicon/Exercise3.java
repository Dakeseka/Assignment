package se.Lexicon;

import java.util.Arrays;

public class Exercise3 {
    /*
     * 3. Write a program which will sort string array.
     * Expected output: String array: [Paris, London, New York, Stockholm]
     *  Sort string array: [London, New York, Paris, Stockholm]
     */

    public static void main(String[] args){

        sortCities();


    }

    public static void sortCities(){
        String[] names = {"Paris", "London", "New York", "Stockholm"};

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        for (String name : names){
            System.out.println(name);
        }
    }
}
