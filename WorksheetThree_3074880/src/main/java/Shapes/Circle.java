package Shapes;
//Zakarea Erezzaghi 3074880

public class Circle extends Shape {
    private double radius; // circle radius

    // Constructor name and rad
    public Circle(String name, double radius) {
        super(name); // Set the name.
        this.radius = radius; // Set the radius.
    }

    // Calculates area
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area formula.
    }

    // Calculates the perimeter
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // formula
    }

    // circle info
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
