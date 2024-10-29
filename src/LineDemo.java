public class LineDemo {
    public static void main(String[] args) {

        Line line1 = new Line(0, 0, 4, 4);
        System.out.println("Line 1: " + line1);
        System.out.println("Length of Line 1: " + line1.length());
        System.out.println("Midpoint of Line 1: " + line1.midpoint());


        Point p1 = new Point(1, 1);
        Point p2 = new Point(5, 5);
        Line line2 = new Line(p1, p2);
        System.out.println("Line 2: " + line2);
        System.out.println("Length of Line 2: " + line2.length());
        System.out.println("Midpoint of Line 2: " + line2.midpoint());


        Line line3 = new Line(line1);
        System.out.println("Line 3 (Copy of Line 1): " + line3);


        line1.setStart(line2.midpoint());
        System.out.println("Updated Line 1: " + line1);
        System.out.println("New Length of Updated Line 1: " + line1.length());
        System.out.println("New Midpoint of Updated Line 1: " + line1.midpoint());
    }
}
