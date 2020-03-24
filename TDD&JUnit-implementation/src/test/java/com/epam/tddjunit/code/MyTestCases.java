package com.epam.tddjunit.code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTestCases {

	@BeforeEach
	void welcomeText() {
		System.out.println("TESTCASE RAN!!");
	}
	
	@Test
	void testNChars() {
		RemoveAfromFirst2Chars obj = new RemoveAfromFirst2Chars();
		String result = obj.removeA("Aami KKR");
		assertEquals("mi KKR" , result);
	}
	
	@Test
	void test0Chars() {
		RemoveAfromFirst2Chars obj = new RemoveAfromFirst2Chars();
		String result = obj.removeA("");
		assertEquals("Input String not found!!" , result);
	}
	
	@Test
	void test1Chars() {
		RemoveAfromFirst2Chars obj = new RemoveAfromFirst2Chars();
		String result = obj.removeA("A");
		assertEquals("Removed!" , result);
	}
	
	@Test
	void test2Chars() {
		RemoveAfromFirst2Chars obj = new RemoveAfromFirst2Chars();
		String result = obj.removeA("AB");
		assertEquals("B" , result);
	}
	
	@Test
	void test3Chars() {
		RemoveAfromFirst2Chars obj = new RemoveAfromFirst2Chars();
		String result = obj.removeA("ABA");
		assertEquals("BA" , result);
	}

}
