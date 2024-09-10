public class Branching {
    public static void main(String[] args) {
//N1
        int a = 5, b = 4, c = 0;

        System.out.println((a < b && b < c) ? "increasing" : (a > b && b > c) ? "decreasing" : "neighter");

//N2
        int date = 1000000;
        if (date % 400 == 0) {
            System.out.println("Leap century");
        } else if (date % 4 == 0) {
            System.out.println("Leap year");
        } else System.out.println("Normal year");
//N3
        char operator = '+';
        int x = 5;
        int y = 8;

        switch (operator) {
            case '+':
                System.out.println("The result is: " + (x + y));
                break;

            case '-':
                System.out.println("The result is: " + (x - y));
                break;
            case '/':
                System.out.println("The result is: " + (x / y));
                break;
            case '*':
                System.out.println("The result is: " + (x * y));
                break;
            default:
                System.out.println("User entered wrong operator");
        }
//N4
        String semesterOne = "Fall";
        String semesterSecond = "Spring";
        String programOne = "Introduction to Computer Science";
        String programTwo = "English Literature";


        switch (semesterOne) {
            case "Fall":
                System.out.println("The course will be 'Object-Oriented Programming' for the " + programOne + " program");

                switch (semesterSecond) {
                    case "Spring":

                        System.out.println("The course will be 'Introduction to Journalism' for the " + programTwo + " program");
                        break;

                }
                break;
            default:
                System.out.println("Default");
        }


    }
}


