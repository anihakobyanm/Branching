public class Point {
    private double x1;
    private double y1;

    public Point() {
    }


    public Point(double x, double y) {
        this.x1 = x;
        this.y1 = y;
    }

    public Point(Point anottherPoint) {
        this.x1 = anottherPoint.x1;
        this.y1 = anottherPoint.y1;
    }

    public double getX() {
        return x1;
    }

    public double getY() {
        return y1;
    }

    public void setX(double x) {
        this.x1 = x;
    }

    public void setY(double y) {
        this.y1 = y;
    }

    public double[] getCoordinates() {
        return new double[]{x1, y1};
    }

    public void setCoordinates(double newX, double newY) {
        this.x1 = newX;
        this.y1 = newY;
    }
    public String toString() {
        return "Point(" + x1 + ", " + y1 + ")";
    }

}
