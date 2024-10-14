import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text: ");
        String input = scanner.nextLine();
        int count = printTotalNumber(input);
        System.out.println("The string has " + count + " characters");
        scanner.close();


        printText("Hello");


    }

    public static int printTotalNumber(String text) {
        return text.length();

    }

    public static void printText(String line) {
        for (int i = 0; i < line.length(); i++) {
            System.out.println(line.charAt(i));

        }

    }
}
