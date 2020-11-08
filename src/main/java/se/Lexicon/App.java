package se.Lexicon;


public class App {
    public static void main(String[] args) {

        /**
         [] = syntax for creating an array
         we can create arrays from primitives and objects.
         */


        App app = new App();
        //System.out.println(app.findName("David"));
        //System.out.println(app.findName("Roger"));

        //testTest();
        //indexBasedLoop();
        twoDimensionArray();


    }

    public static void twoDimensionArray() {
        int[][] numbers = new int[5][5];

        numbers[0][0] = 1;
        numbers[4][4] = 9;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);

                if (j == numbers[i].length - 1) {

                    System.out.println();
                }

            }

        }

    }

    public static void indexBasedLoop() {

        int[] numbers = new int[]{3, 4, 8, 1, 1};


        for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = i+1;
            //System.out.println("i = " + i);
            System.out.print(numbers[i]);

        }


    }

    private String[] names = {
            "David", "Simon", "Nelli", "Edsel", "Ola", "Carin"
    };


    public String findName(String nameToFind) {
        for (String name : names) {
            if (name.equalsIgnoreCase(nameToFind)) {
                return "Yes";
            }
        }
        return "Error: No match";
    }

    public static void twoDimensionalArray() {
        int[][] numbers = new int[5][5];

        numbers[0][0] = 1;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]);


                //This adds new lines after 5 numbers
                if (j == numbers[i].length - 1) {
                    System.out.println();
                }
            }
        }


    }

    public static void testTest() {
        double[] doubles = new double[]{10.5, 11.9, 15.16};

        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
    }


}