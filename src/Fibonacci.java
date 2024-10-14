public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(printFibonacciNumber(8));
        System.out.println(printFactorial(4));
        System.out.println(printFunction(8, 2));
        int [] myarray= {1,2,5,7,125,-12,1};
        printValue(myarray);

    }


    public static int printFibonacciNumber(int number) {
        if (number == 0)
            return 0;
        else if (number == 1) {
            return 1;

        } else
            return printFibonacciNumber(number - 1) + printFibonacciNumber(number - 2);
    }

    public static int printFactorial(int item) {
        if (item == 0)
            return 0;
        else if (item == 1) {
            return 1;
        } else
            return item * printFactorial(item - 1);
    }

    public static int printFunction(int n, int k) {
        if (k == 0)
            return 1;
        else if (k == 1) {
            return n;

        } else
            return n * printFunction(n, k - 1);

    }

    public static void printValue(int[] array) {

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];


            }
            if (array[i] > max) {
                max = array[i];
            }


        }
        System.out.println("min value is: " + min);
        System.out.println("max value is: " + max);

    }

}
