package com.lti.demos;

public class Calculator {
	public String sayHello() {
		return "hello world";
	}

	public int addNos(int x, int y) {
		int result=x+y;
		return result;
	}
	
	public int subNos(int x, int y) {
		int result=x-y;
		return result;
	}
	
	public void searchEmp(int empId) {
		if (empId==0)
		{
			throw new ArithmeticException("u entered zero");
		}else {
			System.out.println("print something");
		}
	}
}
