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

        String semester = "Fall";
        String program = "CS";

        String course = "Output";

        switch (semester) {
            case "Fall":
                switch (program) {
                    case "CS":
                        course = "Introduction to Computer Science";
                        break;
                    case "EC":
                        course = "English Literature";
                        break;
                    default:
                        course = "Please choose the existing program";
                }
                break;
            case "Spring":
                switch (program) {
                    case "CS":
                        course = "Object-Oriented Programming";
                        break;
                    case "EC":
                        course = "Introduction to Journalism";
                        break;
                    default:
                        course = "Please choose the existing program";
                }
                break;
            default:
                course = "Please choose the existing semester";
        }

        System.out.println("Required course is : " + course);
    }
}

