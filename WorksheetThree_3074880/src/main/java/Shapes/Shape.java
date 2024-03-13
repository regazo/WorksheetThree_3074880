package Shapes;
//Zakarea Erezzaghi 3074880
public abstract class Shape {
    private String name; 

    // Constructor to set the shapes name
    public Shape(String name) {
        this.name = name;
    }

    // Gets the shapes name
    public String getName() {
        return name;
    }

    // Sets the shapes name
    public void setName(String name) {
        this.name = name;
    }

    // Method that calculates area
    public abstract double area();

    // Method that calculates perimeter
    public abstract double perimeter();

    // Convert shape info to a string
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
