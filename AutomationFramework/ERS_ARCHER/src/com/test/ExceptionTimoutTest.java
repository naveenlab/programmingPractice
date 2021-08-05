package com.test;

import org.testng.annotations.Test;

public class ExceptionTimoutTest {
	
	/*@Test(invocationTimeOut = 2, expectedExceptions = NumberFormatException.class)
	public void infiniteLoop() {
		int i =1;
		while (i == 1) {
			System.out.println("*******lovely*******");
		}
	}*/
	
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void expectedExTest() {
		String x = "1000A";
		Integer.parseInt(x);
		}
	}



