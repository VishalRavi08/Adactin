package com.testng;

import org.testng.annotations.Test;

public class Testng_ExpectedExceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void aMethod() throws InterruptedException {
		
		int a=5/0;
		System.out.println("A Method");
	}

	@Test
	public void bMethod() {
	
		System.out.println("B Method");
	}

	@Test
	public void cMethod() {
		
		System.out.println("C Method");

	}

}
