package se.Lexicon;

/*
9. Write a method which will add elements in an array.
Remember that arrays are fixed in size so you need to come up with a
solution to “expand” the array.
 */

import java.util.Arrays;

public class Exercise9 {

    public static void main(String[] args) {
        String[] names = new String[]{"David", "Clas", "Simon"};


        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }


        System.out.println(); //Creates new line.


        names = addNameToArray(names, "Fredrik");
        //names = addNameToArray(names, "Jonas");
        //names = addNameToArray(names, "Bert");

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }

    }

    public static String[] addNameToArray(final String[] source, String name) {

        String[] newArray = Arrays.copyOf(source, source.length + 1);
        newArray [newArray.length -1] = name;


        return newArray;
    }

}
