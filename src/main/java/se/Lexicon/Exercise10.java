package se.Lexicon;

/*

https://stackoverflow.com/questions/20076142/java-2d-array-multiplication-table


 10.Write a program which will represent multiplication table stored in
 multidimensional array.
 Hint: You have two-dimensional array with values
 [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
 */

public class Exercise10 {


    public static void main(String[] args) {

        int[][] numbers = new int[10][10];

        numbers = timesTable(10, 10);

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + ", ");
            }
            System.out.println();
        }


    }

    public static int[][] timesTable(int x, int y) {

        int[][] yes = new int[x][y];
        for (int i = 0; i < yes.length; i++) {
            for (int j = 0; j < yes[i].length; j++) {
                yes[i][j] = (i + 1) * (j + 1);
            }
        }

        return yes;

    }


}
