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

}