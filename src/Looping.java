public class Looping {
    public static void main(String[] args) {
//N1
        long input = 5656565;
        long size = 0;

        for (long i = input; i != 0; i = i / 10) {
            size++;
        }

        System.out.println(size);

//N2
//N3 infinite loop եմ ստացել , հեհեհ ։Դ
//        int a = 7;
//        int b = 56;
//        boolean repeat = false;
//        do {
//            repeat = true;
//
//            int sum = a + b;
//            //System.out.println(sum);
//        }
//        while (repeat);


        //N4 0 1 1 2 3 5 8 fibonacci
        int numberOne = 0;
        int numberTwo = 1;
        int count = 1;
        for (int i = 1; i < 100; ) {

            int next = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = next;
            count++;
            //System.out.println(i);
        }
        System.out.println(count);
    }
}



