package Shapes;
//Zakarea Erezzaghi 3074880

public class RightAngledTriangle extends Shape {
    private double base; //  base of  triangle
    private double height; //  height of triangle

    // Constructor for name, base and the height
    public RightAngledTriangle(String name, double base, double height) {
        super(name); // Sets the name
        this.base = base; // Sets the base
        this.height = height; // Set thes height
    }

    // Calculates area
    @Override
    public double area() {
        return (base * height) / 2;
    }

    // Calculates perimeter
    @Override
    public double perimeter() {
        double hypotenuse = Math.sqrt(base * base + height * height);
        return base + height + hypotenuse;
    }

    // Info about triangle
    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
}
