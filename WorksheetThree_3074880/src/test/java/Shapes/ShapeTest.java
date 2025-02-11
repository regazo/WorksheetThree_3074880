package Shapes;
//Zakarea Erezzaghi 3074880


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ShapeTest {

	@Test
	public void testCircleArea() {
	    // circle with radius 2
	    Circle circle = new Circle("Circle", 2.0);
	    // Checking if circle area is correct
	    assertEquals("Area calculation for Circle is incorrect", Math.PI * 4, circle.area(), 0.001);
	}
	@Test
	public void testCirclePerimeter() {
	    // Circle  radius 2 to check for perimeter
	    Circle circle = new Circle("Circle", 2.0);
	    // Verify perimeter
	    assertEquals("Perimeter calculation for Circle is incorrect", 2 * Math.PI * 2, circle.perimeter(), 0.001);
	}
	@Test
	public void testRhombusArea() {
	    //  rhombus to check  area calculation
	    Rhombus rhombus = new Rhombus("Rhombus", 4.0, 3.0);
	    // Testing for area calculation if its correct
	    assertEquals("Area calculation for Rhombus is incorrect", 6.0, rhombus.area(), 0.001);
	}
	@Test
	public void testRhombusPerimeter() {
	    // Rhombus with known diagonals to check perimeter.
	    Rhombus rhombus = new Rhombus("Rhombus", 4.0, 3.0);
	    // Calculate one side to get the perimeter.
	    double side = Math.sqrt((4.0 * 4.0 + 3.0 * 3.0) / 4);
	    // Verify the perimeter calculation.
	    assertEquals("Perimeter calculation for Rhombus is incorrect", 4 * side, rhombus.perimeter(), 0.001);
	}
	@Test
	public void testRightAngledTriangleArea() {
	    // Triangle to check area
	    RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3.0, 4.0);
	    assertEquals("Area calculation for RightAngledTriangle is incorrect", 6.0, triangle.area(), 0.001);
	}
	@Test
	public void testRightAngledTrianglePerimeter() {
	    // Same triangle just for perimeter
	    RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3.0, 4.0);
	    //  hypotenuse for perimeter
	    double hypotenuse = Math.sqrt(3.0 * 3.0 + 4.0 * 4.0);
	    // Checks  whole perimeter
	    assertEquals("Perimeter calculation for RightAngledTriangle is incorrect", 3.0 + 4.0 + hypotenuse, triangle.perimeter(), 0.001);
	}
}