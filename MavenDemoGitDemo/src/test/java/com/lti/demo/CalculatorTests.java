package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	Calculator c=new Calculator();
	@Disabled
	@Test
	public void testSayHello() {
		Assertions.assertEquals("hello world", c.sayHello());
	}
	@Disabled
	@Test
	public void testAddTwoNos() {
		int result=c.addNos(100, 200);
		Assertions.assertEquals(300, result);
		
	}
	@Disabled
	@Test //mes optional..if test case fail then it is displayed
	public void testSubTwoNos() {
		int result=c.subNos(200, 100);
		Assertions.assertEquals(100, result,"subtraction method code");
	}
	@Disabled
	@Test
	public void testAssertNulls() {
		String s1=null;
		String s2="Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	@Disabled
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller");
		Assertions.assertNotEquals("Hello", "Hello");
	}
	
	@Test
	public void testArray() {
		ArrayList<Integer> myList=new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
		
	}
	
}
