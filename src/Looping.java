public class Looping {
    public static void main(String[] args) {
        //1
        long input = 123456;
        long size = 0;

        for (long i = input; i != 0; i = i / 10) {
            size++;
        }

        System.out.println(size);

        //N2
        int[] array = {1, 5, 6, 7, 1, 4, 5, 6, 88, 9};
        int smallest = array[0];
        int largest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > largest) {
                largest = i;
            }
            System.out.println("The smallest number is " + smallest);
            System.out.println("The largest number is " + largest);

        }
        //N3
        int num1 = 5;
        int num2 = 10;
        int loopCount = 3;
        do {
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
            loopCount--;

        } while (loopCount > 0);

        System.out.println("Program terminated.");


        //N4
        int x = 5;
        int y = 8;

        int result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;

        }
        System.out.println(result);


        //5
        for (int i = 1; i <= 500; i++) {
            int sum = 0;
            int temp = i;

            while (temp != 0) {
                int numb = temp % 10;
                sum += numb * numb * numb;
                temp /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        //6
        int first = 0;
        int second = 1;
        int pattern = 100000000;

        for (int i = 1; i <= pattern; i++) {

            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(pattern);


        //7


        //8
        int p = 5;

        for (int i = 1; i <= p; i++) {

            for (int j = p; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = p - 1; i >= 1; i--) {

            for (int j = p; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}



