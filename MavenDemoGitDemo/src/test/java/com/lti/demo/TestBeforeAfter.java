package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {

	int sum=0;
	Calculator c=new Calculator();
	
	@BeforeAll
	public static void testStartDbConn() {
		System.out.println("Db connection is up- only once");
	}
	
	@BeforeEach
	public void testStartup() {
		sum=0;
		System.out.println("sum is zero" +sum);
	}
	
	@Test
	public void testAddTwoNos() {
		int result=c.addNos(100, 200);
		Assertions.assertEquals(300, result);
		
	}
	
	@Test 
	public void testSubTwoNos() {
		int result=c.subNos(200, 100);
		Assertions.assertEquals(100, result,"subtraction method code");
	}
	
	@AfterEach
	public void testShutDown() {
		System.out.println("some object null");
	}
	
	@AfterAll
	public static void testShutDownConn() {
		System.out.println("shutting down db connection");
	}
}
