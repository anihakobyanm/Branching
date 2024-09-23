import java.util.Scanner;

public class MethodsPractise {
    //Write a program that generates a random number in the range [0, n] and asks the user to guess what the number is.
    // If the user's guess is higher than the random number, the program should display "Too high, try again." If the user's
    // guess is lower than the random number, the program should display "Too low, try again." The program should use a loop
    // that repeats until the user correctly guesses the random number. Now switch the sides: you are choosing a random number,
    // and the program should guess it.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int guess;
        String response;

        System.out.println("Խնդրում եմ մտածեք թիվ 0-ից " + max + " միջակայքում:");

        while (true) {
            guess = (min + max) / 2;
            System.out.println("Դուք մտապահել եք : " + guess);
            System.out.print("Արդյո՞ք գուշակել եմ ձեր մտապահած թիվը (մուտքագրեք 'Too high', 'Too low', կամ 'Correct'): ");
            response = scanner.nextLine();

            switch (response.toLowerCase()) {
                case "too high":
                    max = guess - 1;
                    break;

                case "too low":
                    min = guess + 1;
                    break;

                case "correct":
                    System.out.println("Դուք մտապահել եք : " + guess);
                    return;

                default:
                    System.out.println("Խնդրում եմ մուտքագրեք 'Too high', 'Too low', կամ 'Correct'");
                    break;
            }
        }
    }
}
