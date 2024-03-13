package Shapes;
//Zakarea Erezzaghi 3074880

public class Rhombus extends Shape {
    private double diagonal1; 
    private double diagonal2; 

    // Constructors name and diagonal sizes
    public Rhombus(String name, double diagonal1, double diagonal2) {
        super(name); 
        this.diagonal1 = diagonal1; 
        this.diagonal2 = diagonal2; 
    }

    // Calculates area
    @Override
    public double area() {
        return (diagonal1 * diagonal2) / 2;
    }

    // Calculates perimeter 
    @Override
    public double perimeter() {
        return 4 * Math.sqrt((diagonal1 * diagonal1 + diagonal2 * diagonal2) / 4);
    }

    // Info about  rhombus
    @Override
    public String toString() {
        return super.toString() + ", Diagonals: " + diagonal1 + " and " + diagonal2;
    }
}