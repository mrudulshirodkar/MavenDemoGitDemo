package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class ExceptionsTest {

	//dev writes exceptions - junit checks whether those exceptions are handled or not
	@Test
	void testExceptions() {
		
		Assertions.assertThrows(IllegalArgumentException.class,
		()->{Integer.parseInt("One");}
		);
	}
	
	@Test
	public void testMethodExp() {
		Calculator c=new Calculator();
		final Exception e=assertThrows(ArithmeticException.class, 
				()->{c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero", e.getMessage());
	}

}
