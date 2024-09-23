public class Methods {
    public static void sum(String text1, String text2) {
        System.out.println("\n" +
                "The result is:" + " " + text1 + text2);

    }

    public static void sum(int x, int y) {
        System.out.println("\n"
                + "The result is:" + " " + (x + y));
    }


    public static void main(String[] args) {

        // Write a program that given a 2D array prints it in reverse waveform.

        int[][] myarray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int j = myarray[0].length - 1; j >= 0; j--) {
            if (j % 2 == 0) {
                for (int i = 0; i < myarray.length; i++) {
                    System.out.print(myarray[i][j] + " ");
                }
            } else {
                for (int i = myarray.length - 1; i >= 0; i--) {
                    System.out.print(myarray[i][j] + " ");
                }
            }
        }

        //Write a method(s) sum() such that depending on the parameter types performs appropriate operations.
        // If the input parameters are strings, print their concatenation. If they are integers, print their sum.
        // Example:
        //Method call: sum("aa", "bb") returns: "aabb"
        //Method call: sum(1, 1) returns: 2

        sum(1, 1);
        sum("aa", "bb");


    }
}

