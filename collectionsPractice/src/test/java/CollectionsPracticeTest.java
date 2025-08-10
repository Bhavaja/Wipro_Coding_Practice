package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.CollectionsPractice;

class CollectionsPracticeTest {
	
	CollectionsPractice obj = new CollectionsPractice();

	@Test
	public void test() {
		assertEquals("Keys: name age",obj.viewKeys());
	}

}
