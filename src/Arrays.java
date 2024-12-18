public class Arrays {
    public static void main(String[] args) {
//N1
        int[] array = {1, 55, 4, 78, 45, 56, 125, 1, -101};
        int minimum = array[0];
        int maximum = array[0];
        for (int i : array) {
            if (i < minimum) {
                minimum = i;
            }
            if (i > maximum) {
                maximum = i;
            }
        }
        System.out.println("Minimum value: " + minimum);
        System.out.println("Maximum value: " + maximum);

//N2
        int[] myArray = {1, 2, 3, 4};
        int elementToRemove = 2; // Element to remove

        int newLength = 0;
        for (int num : myArray) {
            if (num != elementToRemove) {
                newLength++;
            }
        }

        int[] newArray = new int[newLength];
        int index = 0;
        for (int num : myArray) {
            if (num != elementToRemove) {
                newArray[index++] = num;
            }
        }

        System.out.println("The final array is: ");
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1) {
                System.out.print(newArray[i]);
            } else {
                System.out.print(newArray[i] + ", ");
            }
        }
//N3

    }
}

