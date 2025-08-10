package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Box;

class BoxTest {
	
	Box box = new Box();

	@Test
	public void testCircleArea() {
		double delta = 0.001;
		assertEquals(28.26,box.circleArea(3),delta);
	}
	
	@Test
	public void testTriangleArea() {
		assertEquals(6,box.triangleArea(3,4));
	}
	
	@Test
	public void testSquareArea() {
		assertEquals(4,box.squareArea(2));
	}
	
	@Test
	public void testRectangleArea() {
		assertEquals(8,box.rectangleArea(4,2));
	}
	
	@Test
	public void testSimpleInterest() {
		assertEquals(720,box.simpleInterest(12000,2,3));
	}
	
	
	
	

}
