package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.CodingPractice;

class CodingPracticeTest {
	
	CodingPractice code = new CodingPractice();
	
	@Test
	public void testReverseTable() {
		assertEquals("20 18 16 14 12 10 8 6 4 2",code.reverseTable(2));
	}
	
	@Test
	public void testPrintAlphabets() {
		assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z",code.printAlphabets());
	}
	
	@Test
	public void testPrintAscii() {
		assertEquals("Ascii value of a is 97",code.printAscii('a'));
	}
	
	@Test
	public void testFindFactorial() {
		assertEquals(120,code.findFactorial(5));
	}
	
	/*@Test
	public void testCountNumbers() {
		assertEquals("positives: 2 negatives: 2 zeroes: 1",code.countNumbers(5));
	}*/
	
	/*@Test
	public void testFindLargeSmall() {
		assertEquals("Smallest number:1 Largest number:4",code.findLargeSmall());
	}*/
	
	

}
