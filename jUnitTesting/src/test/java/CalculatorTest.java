package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Calculator;

class CalculatorTest {
	
	Calculator calc = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(10,calc.add(6, 4));
	}
	@Test
	public void testSub() {
		assertEquals(4,calc.sub(7, 3));
	}
	@Test
	public void testMul() {
		assertEquals(6,calc.mul(2, 3));
	}
	@Test
	public void testDiv() {
		assertEquals(2,calc.div(4, 2));
	}




}
