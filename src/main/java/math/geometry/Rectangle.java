package math.geometry;

public class Rectangle {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {

        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void print(RectanglePrinter printer) {
        printer.print(this.length(), this.breadth(), this.area(), this.perimeter());
    }

    private double length() {
        return Math.max(this.sideA, this.sideB);
    }

    private double breadth() {
        return Math.min(this.sideA, this.sideB);
    }

    public double area() {
        return this.sideA * this.sideB;
    }

    public double perimeter() {
        return 2 * (this.sideA + this.sideB);
    }
}
