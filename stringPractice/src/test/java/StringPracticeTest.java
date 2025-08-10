package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.StringPractice;

class StringPracticeTest {
	
	StringPractice obj = new StringPractice();

	@Test
	public void testRemoveSpaces() {
		assertEquals("Bhavaja",obj.removeSpaces(" Bhav aja "));
	}
	
	@Test
	public void testconcatTwoStrings() {
		assertEquals("Bhavaja Chamarthi",obj.concatTwoStrings("Bhavaja"," Chamarthi"));
	}

}
