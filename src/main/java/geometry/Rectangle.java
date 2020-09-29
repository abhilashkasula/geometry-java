package geometry;

public class Rectangle {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {

        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area() {
        return this.sideA * this.sideB;
    }

    public double perimeter() {
        return 2 * (this.sideA + this.sideB);
    }
}
